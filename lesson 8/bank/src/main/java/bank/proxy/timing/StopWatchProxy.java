package bank.proxy.timing;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StopWatchProxy implements InvocationHandler {

    private Object target;

    public StopWatchProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        // invoke the method on the target
        Object returnValue = method.invoke(target, args);

        stopWatch.stop();
        System.out.println("The method "+ method.getName() + " took " + stopWatch.getTimeElapsed() + " ms");
        return returnValue;
    }
}
