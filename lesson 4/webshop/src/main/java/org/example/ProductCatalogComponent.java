package org.example;

public abstract class ProductCatalogComponent {
    private  String name;

    public ProductCatalogComponent(String name) {
        this.name = name;
    }

    public abstract void print();
}
