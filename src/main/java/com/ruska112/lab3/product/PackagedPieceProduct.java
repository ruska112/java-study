package com.ruska112.lab3.product;

public class PackagedPieceProduct extends PieceProduct {
    private int amount;
    public ProductPackage productPackage;

    public void setAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("PackagedPieceProduct setAmount: amount less or equals 0");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setProductPackage(ProductPackage productPackage) {
        if (productPackage == null) {
            throw new IllegalArgumentException("PackagedPieceProduct setProductPackage: productPackage is null");
        }
        this.productPackage = productPackage;
    }

    public ProductPackage getProductPackage() {
        return productPackage;
    }

    public PackagedPieceProduct(PieceProduct pieceProduct, int amount, ProductPackage productPackage) {
        super(pieceProduct);
        setAmount(amount);
        setProductPackage(productPackage);
    }

    public double getNetWeight() {
        return amount * weight;
    }

    public double getGrossWeight() {
        return amount * weight + productPackage.getWeight();
    }

    public int hashCode() {
        return super.hashCode() + productPackage.hashCode() + amount;
    }

    public boolean equals(PackagedPieceProduct packagedPieceProduct) {
        return hashCode() == packagedPieceProduct.hashCode();
    }

    public String toString() {
        return String.format("Title: %s\nDescription: %s\nWeight: %f\nAmount: %d\nPackage Title: %s\nPackage Weight: %f\n", title, description, weight, amount, productPackage.getTitle(), productPackage.getWeight());
    }
}
