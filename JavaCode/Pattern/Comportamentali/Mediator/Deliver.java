package Mediator;

import java.util.*;

/* ConcreteColleague2 */
public class Deliver implements Colleague{
    String name;
    List<String> messageList = new LinkedList<>();
    Mediator mediator;

    public Deliver(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    public void printSentMessages() {
        System.out.println("\nDeliver's messages:");
        for(String message : messageList) {
            System.out.println(message);
        }
    }

    public void save(String message) {
        messageList.add(message);
    }

    public void send(String addressee, String message) {
        mediator.sendMessage(addressee, message);
    }
    
}
