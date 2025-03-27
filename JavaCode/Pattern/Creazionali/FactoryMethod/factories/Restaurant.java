package FactoryMethod.factories;

import FactoryMethod.products.Burger;

/* Creator */
public abstract class Restaurant {
    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    protected abstract Burger createBurger();
    
}
