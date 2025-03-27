package AbstractFactory.products;

public class OrientalPizza implements Pizza {

    public OrientalPizza() {
        /*Default contructor */
    }

    @Override
    public void bake() {
        System.out.println("Baking Oriental Pizza...");
    }

}