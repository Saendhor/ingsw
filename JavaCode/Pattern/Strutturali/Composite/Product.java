package Composite;

/* <<interface>> Component */
public interface Product {
    public float getPrice();
    public float getWeight();
    public void printDetails();

    /* if obj.type == Leaf then do nothing or error */
    public void add(Product p);
    public void remove(Product p);
}

/* add and remove being added to the "Product" interface
 * means that there's more transparency although it
 * comes at the cost of less security since is accessible
 * through the main
*/