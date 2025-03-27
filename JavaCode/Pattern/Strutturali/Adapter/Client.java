package Adapter;

/* Client */
public class Client {
    public static void main(String[] args) {
        ILabel s = new Label("Lab");
        String l = s.getNextLabel();
        System.out.println(l); // l = Lab1
    }

}