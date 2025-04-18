// Bloccato e' un ConcreteState
public class Bloccato implements StatoBiglietto {
    private String nome;

    @Override
    public void mostra() {
        System.out.println("BLOC Nome: " + nome);
    }

    @Override
    public StatoBiglietto intesta(String s) {
        System.out.println("BLOC Inserito nuovo intestatario");
        nome = s;
        return this;
    }

    @Override
    public StatoBiglietto paga() {
        System.out.println("BLOC Cambia stato da Bloccato a Venduto");
        return new Venduto(nome).paga();
    }

    @Override
    public StatoBiglietto cancella() {
        System.out.println("BLOC Cambia stato da Bloccato a Disponibile");
        return new Disponibile();
    }
}
