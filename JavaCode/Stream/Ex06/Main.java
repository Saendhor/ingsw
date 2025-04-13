import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*  Data una lista di terne di numeri interi per ciascuna terna verificare se essa costituisce un triangolo.
            Restituire la lista dei perimetri per le terne che rappresentano triangoli.
            Suggerimento: in un triangolo ciascun lato è minore della somma degli altri due. */

        List<int[]> triplets = new ArrayList<>();
        triplets.add(new int[] {1,2,3});
        triplets.add(new int[] {3,2,3});
        triplets.add(new int[] {3,10,3});
        triplets.add(new int[] {3,2,4});
        triplets.add(new int[] {3,2,12});

        triplets.stream()
                .filter(t -> t[0] < (t[1] + t[2]))
                .filter(t -> t[1] < (t[0] + t[2]))
                .filter(t -> t[2] < (t[1] + t[0]))
                .forEach(x -> System.out.print("The selected triplet is: {" + x[0] +", " + x[1] +", " + x[2] + "} with perimeter: " + (x[0] + x[1] + x[2]) + "\n"));

    }
    
}
