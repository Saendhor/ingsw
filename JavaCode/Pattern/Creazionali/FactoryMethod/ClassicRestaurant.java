/* ConcreteCreatorA */

public class ClassicRestaurant extends Restaurant{

    @Override
    protected Burger createBurger() {
        System.out.println("Creating classic burger...");
        return new ClassicBurger();
    }
    
}
