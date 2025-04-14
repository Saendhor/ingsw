import java.util.*;

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
        /* Data una lista di istanze di Persona, stampare e contare i nomi dei programmatori */
        List<Persona> team = new LinkedList<Persona>();
        team.add(new Persona("Clara", "RisorseUmane"));
        team.add(new Persona("Adolfo", "Segreterio"));
        team.add(new Persona("Luca", "Programmatore"));
        team.add(new Persona("Sandrina", "Programmatore"));
        team.add(new Persona("Carlo", "Segreterio"));
        team.add(new Persona("Francesca", "RisorseUmane"));
        team.add(new Persona("Simone", "Programmatore"));

        long count = team.stream()
                         .filter(p -> p.getRole().equals("Programmatore"))
                         .peek(p -> System.out.println("Ciao! Sono " + p.getName() + " e sono un* " + p.getRole()))
                         .count();
        
        System.out.println("\nCi sono un totale di " + count + " programmatori");

    }
    
}
