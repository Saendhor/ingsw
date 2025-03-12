import java.util.concurrent.Flow.*;

public class Store implements Subscriber<Persona> {
    private Subscription sub;
    private String storeName;

    public Store(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public void onSubscribe(Subscription s) {
        // a subscription is a linked list of clients (subscribers) sharing the
        // same message queue. subscribers can { request(n) / cancel() } that is,
        // stop future calls of onNext
        this.sub = s;
        System.out.println(storeName + " subscribed.");
        sub.request(1); // comunica disponibilit' a (max) notifica (item)
        // la subscription è l'oggetto che gestisce i buffer per la comunicazione
        // tra subscribers e publishers (è una coda di I/O)
    }

    @Override // riceve ed elabora la notifica
    public void onNext(Persona p) {
        String nom = p.getNome() + "\t" + p.getCognome();
        System.out.println(storeName + " Store onNext: " + nom);
        sub.request(1); // nel frattempo il sub potrebbe essere stato cambiato dal secondo onSubscribe
                        // facendo fallire il request e saltare letture, per questo ho messo una pausa
                        // prima del secondo attach()
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(storeName + " In Store: errore");
    }

    @Override
    public void onComplete() {
        System.out.println(storeName + " In Store: completato");
    }

    @Override
    public String toString() {
        return this.storeName;
    }
}