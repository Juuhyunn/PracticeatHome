package com.example.demo.practice.math.domain;

public class Calculator {
    private int num1;
    private int num2;
    private int result;
    private String opcode;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNum2() {
        return num2;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public int getResult() {
        return result;
    }
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }
    public String getOpcode() {
        return opcode;
    }
}
