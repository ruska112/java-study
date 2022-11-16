package com.ruska112.lab3;

public class PackagedWeightProduct extends WeightProduct {
    private double weight;
    private ProductPackage productPackage;

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("PackagedWeightProduct setWeight: weight less or equals 0");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setProductPackage(ProductPackage productPackage) {
        if (productPackage == null) {
            throw new IllegalArgumentException("PackagedWeightProduct setProductPackage: productPackage is null");
        }
        this.productPackage = productPackage;
    }

    public ProductPackage getProductPackage() {
        return productPackage;
    }

    public PackagedWeightProduct(WeightProduct weightProduct, double weight, ProductPackage productPackage) {
        super(weightProduct);
        setWeight(weight);
        setProductPackage(productPackage);
    }

    public double getNetWeight() {
        return weight;
    }

    public double getGrossWeight() {
        return weight + productPackage.getWeight();
    }

    public int hashCode() {
        return super.hashCode() + productPackage.hashCode() + (int) weight;
    }

    public boolean equals(PackagedWeightProduct packagedWeightProduct) {
        return hashCode() == packagedWeightProduct.hashCode();
    }

    public String toString() {
        return String.format("Title: %s\nDescription: %s\nWeight: %f\nPackage Title: %s\nPackage Weight: %f\n", title, description, weight, productPackage.getTitle(), productPackage.getWeight());
    }
}
