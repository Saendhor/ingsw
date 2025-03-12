import java.util.concurrent.SubmissionPublisher;

public class Dialog {

    // creo addresbook con abbinata subpub n.1
    private static final AddrBook book1 = new AddrBook(new SubmissionPublisher<>());

    // creo due store (subscribers)
    private static final Store st1 = new Store("store1");
    private static final Store st2 = new Store("store2");

    // creo tre item (messaggi)
    private static final Persona p1 = new Persona("Oliver", "Stone", "012345", "NY");
    private static final Persona p2 = new Persona("Ringo", "Starr", "012345", "NY");
    private static final Persona p3 = new Persona("Mick", "Jagger", "012345", "NY");
    private static final Persona p4 = new Persona("Ciccio", "Franco", "012345", "NY");

    // creo una seconda coda di subscribers subPub n.2
    private static SubmissionPublisher<Persona> submission2 = new SubmissionPublisher<>();
    // contiene la subscriprion (lista di clienti consumatori di una item)
    // implementata con buffer e policy concorrente per default
    // la submission non ha concorrenza insita perche' e' solo una interfaccia
    // che racchiude il protocollo di interazione tra publisher e subscriber

    // creo un altro book con la seconda coda di clients
    private static final AddrBook book2 = new AddrBook(submission2);

    // creo un terzo subscriber
    private static final Store st3 = new Store("store3");

    public static void main(String[] args) {
        // collego due subscribers al primo book
        book1.attach(st1);
        book1.attach(st2);

        // scattano tre notifiche per entrambi
        book1.insert(p1);
        book1.insert(p2);
        book1.insert(p3);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // collego un terzo subsciber al secondo book
        book2.attach(st3);
        book2.attach(st2); // st2 in due subscription di due books
        // non ho implementato due subscriptions in store,
        // è una mera sostituzione e potrei perdere delle notifiche
        // per questo lo sleep....per vederle tutte

        // scatta una modifiche per il secondo gruppo
        // e chiudo la coda del primo gruppo
        book2.insert(p1);
        book1.insert(p4);

        // book1.insert(p4);

        // notifica solo per il secondo gruppo
        book2.insert(p4);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        book1.close();
        book2.close();

    }
}
