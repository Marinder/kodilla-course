package com.kodilla.good.patterns.food2door;

public class Product {
    private String supplier;
    private String typeProduct;
    private int quanityProduct;

    public Product(String supplier, String typeProduct, int quanityProduct) {
        this.supplier = supplier;
        this.typeProduct = typeProduct;
        this.quanityProduct = quanityProduct;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public int getQuanityProduct() {
        return quanityProduct;
    }

}
