package InterfacciaSupplier;

import java.util.function.Supplier;

public class Main {
    /*
    Supplier<T> è un'interfaccia funzionale che definisce un metodo get() e rappresenta
    una funzione che prende in ingresso nessun parametro e restituisce un valore di tipo T
    */
    public static void main(String[] args) {
        Supplier<String> sup = () -> "Ciao ciao";
        String myString = sup.get();

        System.out.println(myString);
    }
    
}
