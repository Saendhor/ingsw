import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        /*  .of() ritorna una lista non modificabile contentente gli elementi passati
            .mapToInt() applicato ad uno stream esegue la funzione passata e restituisce un IntStream (fa casting?)
            .sum() somma i valori presenti nello stream, restituisce un int
        */
        int result = Stream.of("ciao", "sono", "Simone")
        .mapToInt(x -> x.length())
        .sum();

        System.out.println("Printing the result");
        System.out.println(result);

        /*  .rangeClosed() restituisce una sequenza di int nell'intervallo specificato con estremi inclusi ed incremento di 1
            .boxed() restituisce uno stream di Integer partendo da un IntStream
        */

        Stream<Integer> myIntStream = IntStream.rangeClosed(1 , 10)
                                        .boxed();
        
        System.out.println("Printing myIntStream vvv");
        myIntStream.forEach(System.out::println);

        /* .mapToObj() restituisce uno stream di oggetti a partire da un IntStream
         *Stream<Integer> var =  IntStream
                            .rangeClosed(0,3)
                            .mapToObj(i -> lista.get(i)); 
         */


         
    }
    
}
