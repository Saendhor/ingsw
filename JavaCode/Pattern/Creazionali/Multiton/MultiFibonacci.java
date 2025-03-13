public class MultiFibonacci {
    private int objId = 0;
    private int index;
    private int[] values = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
    private static int numMaxInstances = 2;
    private static int numInstances = 0;
    private static MultiFibonacci instance;

    //Constructor
    private MultiFibonacci() {
        index = 3;
        objId = numInstances;
    }

    public int getNumValues() {
        return values.length;
    }

    public int getIndex() {
        return index;
    }

    public int getInstanceId() {
        return objId;
    }

    public static MultiFibonacci getInstance() {
        if(numInstances < numMaxInstances) {
            System.out.println("Creating a new instance");
            numInstances++;
            instance = new MultiFibonacci();
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