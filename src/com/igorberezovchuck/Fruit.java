package com.igorberezovchuck;

public class Fruit {

    private FruitType type;
    private Color color;
    private int weightGram;
    private double pricePerKg;

    public Fruit() {
    }

    public Fruit(FruitType type, Color color, int weightGram, double pricePerKg) {
        this.type = type;
        this.color = color;
        this.weightGram = weightGram;
        this.pricePerKg = pricePerKg;
    }

    public Fruit(int weightGram, double pricePerKg) {
        this.weightGram = weightGram;
        this.pricePerKg = pricePerKg;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        return myRound(pricePerKg * weightGram / 1000);
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeightGram(int weightGram) {
        this.weightGram = weightGram;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weightGram=" + weightGram +
                ", pricePerKg=" + pricePerKg +
                '}';
    }

    public double myRound(double roundDouble) {
        return (int) Math.round(roundDouble * 100) / 100.0;
    }

}