package com.pluralsight.finance;

public class Gold extends FixedAsset {

    //properties
    private double weight;

    //constructor
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    //getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}