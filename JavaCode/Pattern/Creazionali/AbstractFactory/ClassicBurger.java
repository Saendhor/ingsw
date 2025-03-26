public class ClassicBurger implements Burger {

    public ClassicBurger() {
        /*Default constructor */
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Classic Burger...");
    }
}