package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    //properties
    private double karat;

    //constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue); //karat * 100?
        this.karat = karat;
    }

    //getters and setters
    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
}