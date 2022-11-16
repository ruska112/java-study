package com.ruska112.lab3;

public class PackagedPieceProduct extends PackagedProduct {
    private int amount;
    // TODO: add getNetWeight getGrossWeight
    public void setAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("PackagedPieceProduct setAmount: amount less or equals 0");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public PackagedPieceProduct() {
        super();
        setAmount(1);
    }
    
    public PackagedPieceProduct(Product product, ProductPackage productPackage, int amount) {
        super(product, productPackage);
        setAmount(amount);
    }

    public int hashCode() {
        int result = super.hashCode();
        result += 69 * amount;
        return result;
    }

    public boolean equals(PackagedProduct packagedProduct) {
        if (packagedProduct == null) {
            throw new IllegalArgumentException("PackagedPieceProduct equals: packagedProduct is null");
        }
        return this.hashCode() == packagedProduct.hashCode();
    }

    public String toString() {
        return String.format("Product Title: %s\nProductDescription: %s\nPackage Title: %s\nPackage Weight: %f\nAmount: %d\n", this.getTitle(), this.getDescription(), this.getProductPackage().getTitle(), this.getProductPackage().getWeight(), this.getAmount());
    }
}
