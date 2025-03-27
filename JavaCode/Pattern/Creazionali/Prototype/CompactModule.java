package Prototype;

public class CompactModule implements Prototype {
    private final int id;
    private final int mode;
    private final String name;

    public CompactModule(int id, int mode, String name) {
        this.id = id;
        this.mode = mode;
        this.name = name;
    }

    public Prototype clone() {
        return new CompactModule(id, mode, name);
    }

    @Override
    public void printDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Mode: " + this.mode);
        System.out.println("Name: " + this.name);
        System.out.println("\n");

    }
}
