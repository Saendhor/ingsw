import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        /* Data una lista di numeri interi positivi verificare se la lista è ordinata. */
        List<Integer> myList = List.of(2, 3, 5, 6, 8);
        boolean isSorted = IntStream.rangeClosed(0, myList.size() -2)
                                    .filter(i -> myList.get(i) < myList.get(i+1))
                                    .findAny()
                                    .isPresent();

        System.out.println("Are the values in the array sorted '<' ? " + isSorted);
    }
    
}
