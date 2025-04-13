import java.util.*;
import java.util.stream.*;

class Persona {
    private String name;
    private String role;

    Persona(String name, String role) {
        setName(name);
        setRole(role);
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

public class Main {
    public static void main(String[] args) {
        /* Data una lista di Persona stampare e contare i nomi dei programmatori */
        List<Persona> team = new LinkedList<Persona>();
        team.add(new Persona("Clara", "RisorseUmane"));
        team.add(new Persona("Adolfo", "Segreterio"));
        team.add(new Persona("Luca", "Programmatore"));
        team.add(new Persona("Sandrina", "Programmatore"));
        team.add(new Persona("Carlo", "Segreterio"));
        team.add(new Persona("Francesca", "RisorseUmane"));
        team.add(new Persona("Simone", "Programmatore"));

        long numProgrammatori = team.stream()
                                    .filter(p -> p.getRole().equals("Programmatore"))
                                    .peek(p -> System.out.println("Ciao! Sono " + p.getName() + " e sono un* " + p.getRole()))
                                    .count();

        System.out.println("\nCi sono " + numProgrammatori + " nel team selezionato");

    }
    
}
