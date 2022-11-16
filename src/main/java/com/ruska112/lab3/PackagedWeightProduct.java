package com.ruska112.lab3;

public class PackagedWeightProduct extends PackagedProduct {
    private double weight;
    // TODO: add getNetWeight getGrossWeight
    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("PackagedWeightProduct setWeight: weight less than 0");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public PackagedWeightProduct() {
        super();
        setWeight(100);
    }
    //TODO: edit constructor
    public PackagedWeightProduct(String title, String description, ProductPackage productPackage, double weight) {
        super(title, description, productPackage);
        setWeight(weight);
    }

    public int hashCode() {
        int result = super.hashCode();
        result += weight;
        return result;
    }

    public boolean equals(PackagedWeightProduct packagedWeightProduct) {
        if (packagedWeightProduct == null) {
            throw new IllegalArgumentException("PackagedWeightProduct equals: packagedWeightProduct is null");
        }
        return this.hashCode() == packagedWeightProduct.hashCode();
    }

    public String toString() {
        return String.format("Product Title: %s\nProductDescription: %s\nPackage Title: %s\nPackage Weight: %f\nWeight: %f\n", this.getTitle(), this.getDescription(), this.getProductPackage().getTitle(), this.getProductPackage().getWeight(), this.getWeight());
    }
}
