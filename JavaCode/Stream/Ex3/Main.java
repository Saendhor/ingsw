import java.util.*;
import java.util.stream.Collectors;

class Pagamento {
    private Persona persona;
    private float cost;

    Pagamento(Persona persona, float cost) {
        this.persona = persona;
        this.cost = cost;
    }

    public Persona getPerson() {
        return persona;
    }

    public float getPrice() {
        return cost;
    }
}

class Persona {
    private String name, role;
    private float salary;

    Persona(String name, String role, float salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public float getSalary() {
        return salary;
    }

}

public class Main {
    public static void main(String[] args) {
        List<Persona> team = new LinkedList<Persona>();
        team.add(new Persona("Clara", "RisorseUmane", 3000f));
        team.add(new Persona("Adolfo", "Segretario", 2000f));
        team.add(new Persona("Luca", "Programmatore", 5000f));
        team.add(new Persona("Sandrina", "Programmatore", 5000f));
        team.add(new Persona("Carlo", "Segretario", 2000f));
        team.add(new Persona("Francesca", "RisorseUmane", 3000f));
        team.add(new Persona("Simone", "Programmatore", 5000f));

        List<Persona> daPagare = new LinkedList<Persona>();

        daPagare.add(team.get(0));
        daPagare.add(team.get(1));
        daPagare.add(team.get(2));

        /* Data una lista di Persona creare una lista di Pagamento con costo calcolato in base a ciascuna persona e stampare i pagamenti*/
        System.out.println("Le seguenti persone fanno parte della lista delle persone da pagare:");
        List<Pagamento> pagati = new LinkedList<Pagamento>();
        pagati = team.stream()
                        .filter(p -> daPagare.contains(p))
                        .map(p-> new Pagamento(p, p.getSalary() * 10))
                        .peek(v -> System.out.println(v.getPerson().getName() + " " + v.getPrice() + " "))
                        .collect(Collectors.toList());
    }
}