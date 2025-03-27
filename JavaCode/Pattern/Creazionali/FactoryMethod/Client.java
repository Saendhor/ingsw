package FactoryMethod;

import FactoryMethod.factories.*;

/* Client */
public class Client {
    public static void main(String[] args) {
        Restaurant orientalRestaurant = new OrientalRestaurant();
        orientalRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant classicRestaurant = new ClassicRestaurant();
        classicRestaurant.orderBurger();
    }
    
}