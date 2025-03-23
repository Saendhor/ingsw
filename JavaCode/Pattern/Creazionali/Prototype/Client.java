public class Client {
    public static void main(String[] args) {
        Prototype firstPrototype = new CompactModule(8, 23, "CompactModule");
        firstPrototype.printDetails();
        Prototype newCopy = firstPrototype.clone();
        newCopy.printDetails();
    }
    
}
