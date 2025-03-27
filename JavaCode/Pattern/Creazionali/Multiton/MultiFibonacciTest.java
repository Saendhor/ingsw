package Multiton;

public class MultiFibonacciTest {

    //Checks the total number of item in the values array of the MultiFibonacci object
    public static void printTestNumValues(MultiFibonacci object) {
        System.out.println("[ID:" + object.getInstanceId() + "] Total number of values is: " + object.getNumValues() + "\n");

    }

    //Here lies the test so that it can be passed to multiple objects hence verifying
    //if the Singleton pattern has been implemented properly
    public static void TestInMain(MultiFibonacci object) {
        //Magic numbers determined by the user who's running the test
        int customIndex = 5;
        int offset = 6;

        //Visualize total number of item in the array
        MultiFibonacciTest.printTestNumValues(object);

        //Set the index to the last selected index, if default it should be 3 else
        //the same index of the last iteration
        object.setIndex(object.getIndex());
        MultiFibonacciTest.printTestValue(object);

        //Set custom index selected by the user
        object.setIndex(customIndex);
        MultiFibonacciTest.printTestValue(object);

        object.setIndex(object.getNumValues() + offset); // int + int
        MultiFibonacciTest.printTestValue(object);

    }

    //Checks current index and the value within it
    public static void printTestValue(MultiFibonacci object) {
        System.out.println("[ID:" + object.getInstanceId() + "] Current index value = " + object.getIndex());
        System.out.println("[ID:" + object.getInstanceId() + "] The current value is " + object.getValue() + "\n");

    }

    public static void main(String[] args) {
        System.out.println("First item tested");
        MultiFibonacci fibObj1 = MultiFibonacci.getInstance();
        MultiFibonacciTest.TestInMain(fibObj1);
        System.out.println("\n");

        System.out.println("Second item tested");
        MultiFibonacci fibObj2 = MultiFibonacci.getInstance();
        MultiFibonacciTest.TestInMain(fibObj2);
        System.out.println("\n");

        System.out.println("Third item tested");
        MultiFibonacci fibObj3 = MultiFibonacci.getInstance();
        MultiFibonacciTest.TestInMain(fibObj3);
        System.out.println("\n");
    }
}

