package application;

import framework.Asserts;
import framework.Before;
import framework.Inject;
import framework.Test;
import framework.TestClass;

@TestClass
public class MyCalculatorTest {

    @Inject
    Calculator calculator;

    @Before
    public void init() {
//        calculator = new CalculatorServiceImpl();
        calculator.reset();
    }

    @Test
    public void method1() {
        Asserts.assertEquals(calculator.add(3),3 );
        Asserts.assertEquals(calculator.add(6),9 );
    }

    @Test
    public void method2() {
        Asserts.assertEquals(calculator.add(3), 3);
        Asserts.assertEquals(calculator.subtract(6), -1);
    }
}
