public class OrientalRestaurant extends Restaurant {

    public OrientalRestaurant() {
        /*Default constructor */
    }

    @Override
    public Burger createBurger() {
        return new OrientalBurger();
    }

    @Override
    public Pizza createPizza() {
        return new OrientalPizza();
    }

}