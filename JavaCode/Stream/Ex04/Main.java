import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        /*Data una lista di stringhe produrre una lista che contiene solo le stringhe che cominciano con un certo prefisso. */
        List<String> myList = new LinkedList<String>();
        myList.add("Luca");
        myList.add("Stefano");
        myList.add("Simone");
        myList.add("Marika");
        myList.add("Valentina");

        String prefix = "S";
        List<String> prefixString = myList.stream()
                                          .filter(s -> s.substring(0, 1).equals(prefix))
                                          .collect(Collectors.toList());
        
        System.out.println(prefixString);
        
    }   
}
