public class FibonacciTest {

    //Checks the total number of item in the values array of the Fibonacci object
    public static void printTestNumValues(Fibonacci object) {
        System.out.println("Total number of values is: " + object.getNumValues() + "\n");

    }

    //Here lies the test so that it can be passed to multiple objects hence verifying
    //if the Singleton pattern has been implemented properly
    public static void TestInMain(Fibonacci object) {
        int offset = 6;

        FibonacciTest.printTestNumValues(object);

        object.setIndex(object.getIndex());
        FibonacciTest.printTestValue(object);

        object.setIndex(5);
        FibonacciTest.printTestValue(object);

        object.setIndex(object.getNumValues() + offset); // int + int
        FibonacciTest.printTestValue(object);

    }

    //Checks current index and the value within it
    public static void printTestValue(Fibonacci object) {
        System.out.println("Current index value = " + object.getIndex());
        System.out.println("The current value is " + object.getValue() + "\n");

    }

    public static void main(String[] args) {
        System.out.println("First item tested");
        Fibonacci fibObj1 = Fibonacci.getInstance();
        FibonacciTest.TestInMain(fibObj1);
        
        System.out.println("\n");

        System.out.println("Second item tested");
        Fibonacci fibObj2 = Fibonacci.getInstance();
        FibonacciTest.TestInMain(fibObj2);
    }
}
