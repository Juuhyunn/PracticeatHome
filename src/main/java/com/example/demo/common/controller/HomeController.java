package com.example.demo.common.controller;

import com.example.demo.practice.math.controller.CalculatorController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        while (true) {
            System.out.println("=================================================");
            System.out.println("[menu]\t0. Exit\t1. Calculator\t2. Sequence");
            System.out.println("=================================================");
            switch (scanner.next()) {
                case "0":
                    System.out.println("종료합니다.");
                    return;
                case "1":
                    calculatorController.calc();
                    break;
                case "2" :
                    calculatorController.sequence();
                    break;
            }
        }
    }
}
