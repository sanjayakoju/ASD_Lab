package application;

import framework.Service;

@Service
public class CalculatorServiceImpl implements Calculator {

    private int calcValue = 0;
    @Override
    public void reset() {
        calcValue = 0;
    }

    @Override
    public int add(int newValue) {
        return calcValue += newValue;
    }

    @Override
    public int subtract(int newValue) {
        return calcValue -= newValue;
    }
}
