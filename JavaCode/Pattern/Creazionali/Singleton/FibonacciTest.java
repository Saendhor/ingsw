package Singleton;

public class FibonacciTest {

    //Checks the total number of item in the values array of the Fibonacci object
    public static void printTestNumValues(Fibonacci object) {
        System.out.println("Total number of values is: " + object.getNumValues() + "\n");

    }

    //Here lies the test so that it can be passed to multiple objects hence verifying
    //if the Singleton pattern has been implemented properly
    public static void TestInMain(Fibonacci object) {
        //Magic numbers determined by the user who's running the test
        int customIndex = 5;
        int offset = 6;

        //Visualize total number of item in the array
        FibonacciTest.printTestNumValues(object);

        //Set the index to the last selected index, if default it should be 3 else
        //the same index of the last iteration
        object.setIndex(object.getIndex());
        FibonacciTest.printTestValue(object);

        //Set custom index selected by the user
        object.setIndex(customIndex);
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
