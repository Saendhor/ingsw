package Composite;

public class MainCart {
    private static final Product cart = new ShoppingCart();
    private static final Product book = new Book("Rosso Malpelo", 6.6f, 2.0f);
    private static final Product ebook = new EBook("Cobain's Diary", 30.8f, 54.6f);

    public static void main(final String[] args) {
        cart.add(book);
        cart.add(ebook);
        cart.printDetails();
        System.out.println("\nPeso del Carrello " + cart.getWeight());
    }
    
}