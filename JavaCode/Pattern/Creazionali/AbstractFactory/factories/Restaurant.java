package AbstractFactory.factories;

import AbstractFactory.products.Burger;
import AbstractFactory.products.Pizza;

public abstract class Restaurant {
    public abstract Burger createBurger();
    public abstract Pizza createPizza();

}