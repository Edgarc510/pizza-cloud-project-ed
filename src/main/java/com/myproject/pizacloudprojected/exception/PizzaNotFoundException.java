package com.myproject.pizacloudprojected.exception;

public class PizzaNotFoundException extends RuntimeException{
    public PizzaNotFoundException(String message) {
        super(message);
    }
}
