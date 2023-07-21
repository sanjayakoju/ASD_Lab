package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Category extends ProductCatalogComponent {

    private String name;
    protected Collection<ProductCatalogComponent> productCatalogComponents = new ArrayList<>();

    public Category(String name) {
        super(name);
        this.name = name;
    }

    public void addProductCategoryComponent(ProductCatalogComponent productCatalogComponent) {
        productCatalogComponents.add(productCatalogComponent);
    }

    @Override
    public void print() {
        System.out.println("Category name : "+name);
        for (ProductCatalogComponent productCatalogComponent: productCatalogComponents) {
            productCatalogComponent.print();
        }
    }
}
