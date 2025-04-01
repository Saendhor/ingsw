package Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator myPhone = new Phone();

        Colleague Antonio = new Tracker("Antonio", myPhone);
        Colleague Ciccio = new Tracker("Ciccio", myPhone);

        myPhone.addToAddressBook(Ciccio);
        myPhone.addToAddressBook(Antonio);

        Ciccio.send("Antonio", "I'm the courier, please register order n.2");

    }
    
}
