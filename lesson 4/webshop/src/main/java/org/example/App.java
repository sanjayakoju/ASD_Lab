package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Category fashion = new Category("Fashion");
        Category electronic = new Category("Electronic");
        Category beauty = new Category("Beauty");

        Product pant = new Product("Pant", 120.0);
        Product shirt = new Product("Shirt", 35.0);
        Product iphone = new Product("Iphone", 1200.0);
        Product suncream = new Product("Suncream", 120.0);

        fashion.addProductCategoryComponent(pant);
        fashion.addProductCategoryComponent(shirt);

        electronic.addProductCategoryComponent(iphone);
        beauty.addProductCategoryComponent(suncream);

        fashion.print();
        electronic.print();
        beauty.print();
    }
}
