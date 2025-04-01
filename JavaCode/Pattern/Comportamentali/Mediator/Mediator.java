package Mediator;

/* <<interface>> Mediator */
public interface Mediator {
    void sendMessage(String addressee, String message);
    void addToAddressBook(Colleague colleague);
}
