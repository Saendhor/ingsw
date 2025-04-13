import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        /*  Data una lista di numeri interi verificare se ciascuna terna formata prendendo dalla lista tre numeri contigui costituisce un triangolo
            Esempio: lista {2, 3, 5, 7, 8}, terne {2, 3, 5}, {3, 5, 7}, {5, 7, 8} */
        
        List<Integer> myList = new LinkedList<Integer>();
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(8);

        IntStream   .rangeClosed(0, myList.size() - 3)
                    .mapToObj(i -> new int[] {myList.get(i), myList.get(i+1), myList.get(i+2)})
                    .filter(t -> t[0] < t[1] + t[2])
                    .filter(t -> t[1] < t[0] + t[2])
                    .filter(t -> t[2] < t[1] + t[0])
                    .forEach(t -> System.out.println("La richiesta è esaudita per la terne:\n{"+ t[0] + t[1] + t[2] + "}"));
                    

    }
    
}
