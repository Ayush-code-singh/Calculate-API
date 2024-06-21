package com.indusnet.ums.exception;

public class CalculatorNotFoundException extends RuntimeException{
    public CalculatorNotFoundException(String message) {
        super(message);
    }
}