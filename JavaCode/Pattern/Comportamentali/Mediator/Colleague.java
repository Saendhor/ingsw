package Mediator;

/* <<interface>> Colleague */
public interface Colleague {
    String getName();
    void printSentMessages();
    void save(String message);
    void send(String addressee, String message);
}
