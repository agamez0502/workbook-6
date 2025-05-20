package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {

    //properties
    private String name;
    private double marketValue;

    //constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    //methods
    @Override
    public double getValue() {
        return marketValue;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}