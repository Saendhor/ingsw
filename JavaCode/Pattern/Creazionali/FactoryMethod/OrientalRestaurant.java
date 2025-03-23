/* ConcreteCreatorB */
public class OrientalRestaurant extends Restaurant{

    @Override
    protected Burger createBurger() {
        System.out.println("Creating oriental burger...");
        return new OrientalBurger();
    }
    
}
