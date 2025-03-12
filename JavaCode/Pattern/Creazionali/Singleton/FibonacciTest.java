public class FibonacciTest {

    public static void TestNumValues(Fibonacci object) {
        System.out.println("Total number of values is: " + object.getNumValues() + "\n");

    }

    public static void TestValue(Fibonacci object) {
        System.out.println("Current index value = " + object.getIndex());
        System.out.println("The current value is " + object.getValue() + "\n");

    }

    public static void main(String[] args) {
        Fibonacci fibObj = Fibonacci.getInstance();
        FibonacciTest.TestValue(fibObj);

        fibObj.setIndex(5);
        FibonacciTest.TestValue(fibObj);

        fibObj.setIndex(fibObj.getNumValues() +2);
        FibonacciTest.TestValue(fibObj);
    }
}
