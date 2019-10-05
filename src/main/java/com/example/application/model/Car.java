package com.example.application.model;

public class Car {

    private String brand;
    private String model;
    private int yearOfProduction;
    private Color color;
    private Engine engine;

    public Car(String brand, String model, int yearOfProduction, Color color, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
