/* Data una lista di Persona stampare i ruoli presenti e per ciascun ruolo la lista delle persone aventi
quel ruolo. */

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
        Stream<Persona> team = Stream.of(
            new Persona("Clara", "RisorseUmane"),
            new Persona("Adolfo", "Segreterio"),
            new Persona("Luca", "Programmatore"),
            new Persona("Sandrina", "Programmatore"),
            new Persona("Carlo", "Segreterio"),
            new Persona("Francesca", "RisorseUmane"),
            new Persona("Simone", "Programmatore")
            );

        team.map(p -> p.getRole())
            .distinct()
            .peek(r -> System.out.println("Ruolo: " + r))
            .forEach(r -> team.filter(p -> p.getRole().equals(r))
                              .forEach(p -> System.out.println(p.getName() + " ")));
        

    }
}
