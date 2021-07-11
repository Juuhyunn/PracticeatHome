package com.example.demo.practice.math.service;

import com.example.demo.practice.math.domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int add(Calculator calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(Calculator calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(Calculator calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(Calculator calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remind(Calculator calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }

    @Override
    public String toString(Calculator calculator) {
        return String.format("%d %s %d = %d", calculator.getNum1(),calculator.getOpcode(),calculator.getNum2(),calculator.getResult());
    }

    @Override
    public int[] sequence(Calculator calculator) {
        int count = calculator.getNum2() - calculator.getNum1();
        int[] arr = new int[count];
        int i = 0;
        for (int j = calculator.getNum1(); j < calculator.getNum2(); j++) {
            arr[i] = j;
            i++;
        }
        return arr;
    }
}
