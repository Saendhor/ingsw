/* Data una lista di Persona stampare e contare i nomi dei programmatori */
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
        Stream<Persona> programmerList = Stream.of(new Persona("Carlo", "Programmatore"), new Persona("Gianclaudio", "Programmatore"), new Persona("Annalisa", "Programmatore"));
        
        long request = programmerList.filter(p -> p.getRole().equals("Programmatore"))
                                     .peek(p -> System.out.println("Ciao! Sono " + p.getName() + " e sono un* " + p.getRole()))
                                     .count();

        System.out.println("The number of roles is " + request);
    }
    
}
