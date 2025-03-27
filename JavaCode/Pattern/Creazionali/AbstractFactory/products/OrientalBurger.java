package AbstractFactory.products;

public class OrientalBurger implements Burger {

    public OrientalBurger() {
        /*Default constructor */
    }

    @Override
    public void prepare() {
        // Logic relevant to Oriental Burgers
        System.out.println("Preparing Oriental Burger...");
    }

}