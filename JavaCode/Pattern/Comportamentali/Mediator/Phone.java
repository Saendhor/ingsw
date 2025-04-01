package Mediator;

import java.util.*;

/* ConcreteMediator */
public class Phone implements Mediator{
    List<Colleague> addressBook = new LinkedList<>();

    public void sendMessage(String addressee, String message) {
        for (Colleague currentColleague : addressBook) {
            if(currentColleague.getName().equals(addressee)) {
                currentColleague.save(message);
                System.out.println("\nMessage: " + message + "\nTo: " + addressee);
                return;
            }

        }
        System.out.println("Cannot send message to " + addressee);
    }

    public void addToAddressBook(Colleague colleague) {
        addressBook.add(colleague);
    }

}
