package com.indusnet.ums.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }


    public double calculateResult() {
        double result = switch (this.operator) {
            case "+" -> this.leftOperand + this.rightOperand;
            case "-" -> this.leftOperand - this.rightOperand;
            case "*" -> this.leftOperand * this.rightOperand;
            case "/" -> this.leftOperand / this.rightOperand;
            case "^" -> Math.pow(this.leftOperand, this.rightOperand);
            default -> 0;
        };

        return result;
    }
}