package com.example.demo.practice.math.service;

import com.example.demo.practice.math.domain.Calculator;

public interface CalculatorService {
    //계산기
    int add(Calculator calculator);
    int subtract(Calculator calculator);
    int multiple(Calculator calculator);
    int divide(Calculator calculator);
    int remind(Calculator calculator);
    String toString(Calculator calculator);
    //수열
    int[] sequence(Calculator calculator);
}
