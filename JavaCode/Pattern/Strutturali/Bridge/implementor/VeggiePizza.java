package Bridge.implementor;

/* ConcreteImplementorB */
public class VeggiePizza extends Pizza {
    @Override
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: " + toppings);
        System.out.println("Adding Veggies");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is: " + crust);
    }
    
}
