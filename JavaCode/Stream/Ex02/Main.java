import java.util.*;
import java.util.stream.*;

class Persona {
    String name, role;

    Persona(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

}

public class Main {
    public static void main(String[] args) {
        /* Data una lista di Persona stampare i ruoli presenti e per ciascun ruolo la lista delle persone aventi quel ruolo. */
        List<Persona> team = new LinkedList<Persona>();
        team.add(new Persona("Clara", "RisorseUmane"));
        team.add(new Persona("Adolfo", "Segreterio"));
        team.add(new Persona("Luca", "Programmatore"));
        team.add(new Persona("Sandrina", "Programmatore"));
        team.add(new Persona("Carlo", "Segreterio"));
        team.add(new Persona("Francesca", "RisorseUmane"));
        team.add(new Persona("Simone", "Programmatore"));

        team.stream()
            .map(p -> p.getRole())
            .distinct()
            .peek(r -> System.out.println("Ruolo corrente: " + r))
            .forEach(r -> team.stream() //Questo è lo stesso dell'esercizio 1
                              .filter(p -> p.getRole().equals(r))
                              .forEach(p -> System.out.println("Ciao! Sono " + p.getName() + " e sono un* " + p.getRole())));

    }
}