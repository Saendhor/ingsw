import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /* Data una lista di stringhe produrre una stringa contenente le iniziali di ciascuna stringa della lista */
        List<String> myList = new LinkedList<String>();
        myList.add("Luca");
        myList.add("Stefano");
        myList.add("Simone");
        myList.add("Marika");
        myList.add("Valentina");

        String initials = myList.stream()
                                .map(x -> x.substring(0, 1))
                                .collect(Collectors.joining());
        
        System.out.println(initials); // LSSMV


    }
    
}
