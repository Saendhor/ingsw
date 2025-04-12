package InterfacciaFunction;

import java.util.function.Function;
import java.util.stream.Stream;
/*
In questo esempio map prende in input la funzione stringLength definita sopra per calcolare la
lunghezza di ogni parola e quindi reduce() per sommarle partendo da 0. Sottolineiamo il fatto
che non dobbiamo vedere stringLength come se fosse un valore ma una vera e propria funzione,
che quindi definisce un comportamento che può essere passato a map() 
*/
public class Main {
    public static void main(String[] args) {
        //Funzione lambda che conta il numero totale di lettere in una parola
        Function<String, Integer> stringLength = x -> x.length();

        /*
            .map() prende in ingresso una funzione mapper e restituisce uno stream
                con i risultati dell'esecuzione della funzione mapper (nel nostro caso stringLength assumo) su ciascun elemento
                dello stream iniziale e ogni risultato viene inserito in un nuovo stream
            .reduce() prende in ingresso un valore dello stesso tipo dello stream (valore iniziale)
                e un'espressione lambda con ingresso due valori e ritorno un valore.
                Si usa quando si vuole passare da un insieme di valori a un singolo valore.
                
                Esempio:
                lista.stream().reduce(0, (accum, v) -> accum + v);
                lista.stream().reduce(0, Integer::sum) // Stessa cosa
            
        */
        int result = Stream.of("Beauty", "is", "in", "the", "Eye", "of", "the", "Beholder")
                            .map(stringLength)
                            .reduce(0, Integer::sum);
        System.out.println("Printing the result: " + result);
    }
    
}
