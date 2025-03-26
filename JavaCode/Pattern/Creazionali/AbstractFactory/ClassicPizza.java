public class ClassicPizza implements Pizza {

    public ClassicPizza(){
        /*Default constructor */
    }
    
    @Override
    public void bake() {
        // Logic relevant to Classic Pizzas
        System.out.println("Baking Classic Pizza...");
    }

}