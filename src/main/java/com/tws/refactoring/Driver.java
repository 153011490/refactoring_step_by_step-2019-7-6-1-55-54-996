package com.tws.refactoring;

public class Driver {
    private int age;

    public Driver(){

    }

    public Boolean isLegalDriver() {
        return this.age>=18;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
