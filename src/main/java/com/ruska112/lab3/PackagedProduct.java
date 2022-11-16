package com.ruska112.lab3;

public class PackagedProduct extends Product {
    private ProductPackage productPackage;

    public void setProductPackage(ProductPackage productPackage) {
        if (productPackage == null) {
            throw new IllegalArgumentException("PackagedProduct setProductPackage: productPackage is null!");
        }
        this.productPackage = productPackage;
    }

    public ProductPackage getProductPackage() {
        return productPackage;
    }

    public PackagedProduct() {
        super();
        setProductPackage(new ProductPackage("Package", 100));
    }

    public PackagedProduct(String title, String description, ProductPackage productPackage) {
        super();
        setProductPackage(new ProductPackage("Package", 100));
    }

    public int hashCode() {
        int result = productPackage.hashCode();
        result += getTitle().hashCode();
        result += getDescription().hashCode();
        return result;
    }

    public boolean equals(PackagedProduct packagedProduct) {
        if (packagedProduct == null) {
            throw new IllegalArgumentException("PackagedProduct equals: packagedProduct is null");
        }
        return this.hashCode() == packagedProduct.hashCode();
    }

    public String toString() {
        return String.format("Title: %s, Description: %s, Package Title: %s, Package Weight: %f", getTitle(), getDescription(), this.productPackage.getTitle(), this.productPackage.getWeight());
    }
}
