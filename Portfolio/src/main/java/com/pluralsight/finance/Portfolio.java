package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    //properties
    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<>();

    //constructor
    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    //methods

    //method to add assets
    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    //method to add up the value of every asset in the portfolio
    public double getValue() {
        //should return the net value of all assets
        double total = 0;
        for (Valuable asset : assets) {
            total = total + asset.getValue();
        }
        return total;
    }

    //method to find the asset with the highest dollar value
    public Valuable getMostValuable() {
        //should return the asset that has the highest value
        if (assets.size() == 0) {
            return null;
        }

        Valuable most = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > most.getValue()) {
                most = asset;
            }
        }
        return most;
    }

    //method to find the asset with the lowest dollar value
    public Valuable getLeastValuable() {
        //should return the asset that has the lowest value
        //possibly a credit card with the highest balance
        if (assets.isEmpty()) return null;

        Valuable least = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < least.getValue()) {
                least = asset;
            }
        }
        return least;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    public void setAssets(List<Valuable> assets) {
        this.assets = assets;
    }
}