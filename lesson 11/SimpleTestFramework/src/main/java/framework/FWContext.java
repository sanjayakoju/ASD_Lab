package framework;

import java.lang.annotation.Retention;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

public class FWContext {

	private static List<Object> objectMap = new ArrayList<>();

	public FWContext() {
		try {
			// find and instantiate all classes annotated with the @TestClass annotation
			Reflections reflections = new Reflections("");
			Set<Class<?>> types = reflections.getTypesAnnotatedWith(TestClass.class);
			for (Class<?> implementationClass : types) {
				objectMap.add((Object) implementationClass.newInstance());
			}

			// find and instantiate all classes annotated with the @Service annotation
			Reflections reflections1 = new Reflections("");
			Set<Class<?>> typeServices = reflections1.getTypesAnnotatedWith(Service.class);
			for (Class<?> implemetationClass: typeServices) {
				objectMap.add((Object) implemetationClass.newInstance());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		performDI();
	}

	public void start() {
		try {
			for (Object theTestClass : objectMap) {
				// find all methods annotated with the @Before annotation
				Method beforeMethod = null;
				for (Method method: theTestClass.getClass().getDeclaredMethods()) {
					if (method.isAnnotationPresent(Before.class)) {
						beforeMethod = method;
					}
				}

				// find all methods annotated with the @Test annotation
				for (Method method : theTestClass.getClass().getDeclaredMethods()) {
					if (method.isAnnotationPresent(Test.class)) {
						beforeMethod.invoke(theTestClass);
						method.invoke(theTestClass);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void performDI() {
		try {
			for (Object theTestClass : objectMap) {
				// find annotated fields
				for (Field field : theTestClass.getClass().getDeclaredFields()) {
					if (field.isAnnotationPresent(Inject.class)) {
						// get the type of the field
						Class<?> theFieldType =field.getType();
						//get the object instance of this type
						Object instance = getBeanOfType(theFieldType);
						if (instance != null) {
							//do the injection
							field.setAccessible(true);
							field.set(theTestClass, instance);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object getBeanOfType(Class interfaceClass) {
		Object service = null;
		try {
			for (Object theTestClass : objectMap) {
				Class<?>[] interfaces = theTestClass.getClass().getInterfaces();
				for (Class<?> theInterface : interfaces) {
					if (theInterface.getName().contentEquals(interfaceClass.getName()))
						service = theTestClass;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return service;
	}
}
