import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class Store implements Subscriber<Persona> {
    private Subscription sub;

    @Override
    public void onSubscribe(Subscription s) {
        sub = s;
        sub.request(1);
    }

    @Override
    public void onNext(Persona p) {
        String nom = p.getNome() + "\t" + p.getCognome();
        System.out.println("Store onNext: " + nom);
        sub.request(1);

    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("In Store: errore");
    }

    @Override
    public void onComplete() {
        System.out.println("In Store: completato");
    }
}