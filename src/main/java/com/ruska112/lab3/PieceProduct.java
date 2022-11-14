package com.ruska112.lab3;

public class PieceProduct extends Product {
    private double weight;

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("PieceProduct setWeight: weight less than 0");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public PieceProduct(String title, String description, double weight) {
        super(title, description);
        setWeight(weight);
    }

    public int hashCode() {
        int result = getTitle().hashCode();
        result += getDescription().hashCode();
        result += (int) weight;
        return result;
    }

    public boolean equals(PieceProduct pieceProduct) {
        if (pieceProduct == null) {
            return false;
        }
        return hashCode() == pieceProduct.hashCode();
    }

    public String toString() {
        return String.format("Title: %s, Description: %s, Weight: %f", getTitle(), getDescription(), weight);
    }
}
