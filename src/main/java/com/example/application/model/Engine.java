package com.example.application.model;

public class Engine {

    private String name;
    private int power;
    private int capacity;

    public Engine(String name, int power, int capacity) {
        this.name = name;
        this.power = power;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
