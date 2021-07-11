package com.example.demo.practice.math.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.practice.math.domain.Calculator;
import com.example.demo.practice.math.service.CalculatorService;
import com.example.demo.practice.math.service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    public void calc() {
    System.out.println("계산기를 실행합니다.");
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    CalculatorService calculatorService = new CalculatorServiceImpl();
    System.out.println("숫자 1을 입력하세요 :");
    calculator.setNum1(scanner.nextInt());
    System.out.println("연산자를 입력하세요 :");
    calculator.setOpcode(scanner.next());
    System.out.println("숫자 2를 입력하세요 :");
    calculator.setNum2(scanner.nextInt());
    switch(calculator.getOpcode()) {
        case "+" :
            calculator.setResult(calculatorService.add(calculator));
            break;
        case "-" :
            calculator.setResult(calculatorService.subtract(calculator));
            break;
        case "*" :
            calculator.setResult(calculatorService.multiple(calculator));
            break;
        case "/" :
            calculator.setResult(calculatorService.divide(calculator));
            break;
        case "%" :
            calculator.setResult(calculatorService.remind(calculator));
            break;
        }
        System.out.println(calculatorService.toString(calculator));
    }
    public void sequence() {
        System.out.println("수열을 시작합니다.");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        CalculatorService calculatorService = new CalculatorServiceImpl();
        System.out.println("수열의 처음은 ? :");
        calculator.setNum1(scanner.nextInt());
        System.out.println("수열의 마지막은 ? :");
        calculator.setNum2(scanner.nextInt()+1);
        int[] arr = calculatorService.sequence(calculator);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
