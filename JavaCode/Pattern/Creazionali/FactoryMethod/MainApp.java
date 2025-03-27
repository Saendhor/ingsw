package FactoryMethod;

import FactoryMethod.factories.*;

/* Client */
public class MainApp {
    public static void main(String[] args) {
        Restaurant orientalRestaurant = new OrientalRestaurant();
        orientalRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant classicRestaurant = new ClassicRestaurant();
        classicRestaurant.orderBurger();
    }
    
}