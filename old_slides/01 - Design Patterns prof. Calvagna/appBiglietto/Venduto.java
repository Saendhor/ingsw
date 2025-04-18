import java.time.LocalDateTime;

public class Venduto implements StatoBiglietto { // Venduto e' un ConcreteState
    private final String nome;
    private LocalDateTime dataPagam;

    public Venduto(String n) {
        nome = n;
    }

    @Override
    public void mostra() {
        System.out.println("VEND Nome: " + nome);
    }

    @Override
    public StatoBiglietto intesta(String s) {
        System.out.println("VEND Non puo' cambiare il nome nello stato Venduto");
        return this;
    }

    @Override
    public StatoBiglietto paga() {
        if (dataPagam == null) {
            dataPagam = LocalDateTime.now();
            System.out.println("VEND Pagamento effettuato");
        } else
            System.out.println("VEND Il biglietto era gia' stato pagato");
        return this;
    }

    @Override
    public StatoBiglietto cancella() {
        System.out.println("VEND Non puo' cambiare stato da Venduto a Disponibile");
        return this;
    }
}
