public class Fibonacci {
    private static Fibonacci instance = new Fibonacci();
    private int index;
    private int[] values = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};

    private Fibonacci() {
        index = 3;
    }

    public int getNumValues() {
        return values.length;
    }

    public int getIndex() {
        return index;
    }

    public static Fibonacci getInstance() {
        if(instance == null) {
            System.out.println("Previous instance not found. Creating a new one...");
            instance = new Fibonacci();
        }
        return instance;
    }

    //Query method
    public int getValue() {
        //Make sure index respects values array boundaries
        if(index < values.length) {
            index++;
        }
        return values[index-1];
    }

    //Command method
    public void setIndex(int inputIndex) {
        index = inputIndex % values.length;
    }
}