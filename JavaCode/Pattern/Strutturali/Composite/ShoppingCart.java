package Composite;

import java.util.*;

/* Composite */
public class ShoppingCart implements Product{
    private List<Product> productList = new ArrayList<>();

    public float getPrice() {
        return productList.stream().map(e -> e.getPrice()).reduce(0f, Float::sum);
    }

    public float getWeight() {
        return productList.stream().map(e -> e.getWeight()).reduce(0f, Float::sum);
    }

    public void printDetails() {
        System.out.println("Carrello: ");
        for (Product res : productList) {
            res.printDetails();
        }
        System.out.println("Prezzo totale: " + getPrice());
    }

    /* if obj.type == Leaf then do nothing or error */
    public void add(Product p) {
        productList.add(p);

    }

    public void remove(Product p) {
        productList.remove(p);
    }
}
