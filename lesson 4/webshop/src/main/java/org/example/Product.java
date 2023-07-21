package org.example;

public class Product extends ProductCatalogComponent {
    private double price;
    private String name;

    public Product(String name, double price) {
        super(name);
        this.price = price;
        this.name = name;
    }


    @Override
    public void print() {
        System.out.println("Product Leaf : {"+ "name = "+name+" , Price : "+price +"}");
    }
}
