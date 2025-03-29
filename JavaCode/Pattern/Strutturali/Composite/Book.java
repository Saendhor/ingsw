package Composite;

/* Leaf */
public class Book implements Product{
    private String title;
    private float price;
    private float weight;

    public Book(String title, float price, float weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public float getPrice() {
        return this.price;
    }

    public float getWeight() {
        return this.weight;
    }

    public void printDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Price: €" + getPrice());
        System.out.println("Weight: " + getWeight() + "g");
    }


    /* Since is a leaf, add and remove should do nothing */
    @Override
    public void add(Product p) {
        //Do nothing
    }

    public void remove(Product p) {
        //Do nothing
    }
    
}
