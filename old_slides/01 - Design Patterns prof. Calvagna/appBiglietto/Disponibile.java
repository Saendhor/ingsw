// Disponibile e' un ConcreteState
public class Disponibile implements StatoBiglietto {
    @Override
    public void mostra() {
    }

    @Override
    public StatoBiglietto intesta(String s) {
        System.out.println("DISP Cambia stato da Disponibile a Bloccato");
        StatoBiglietto sb = new Bloccato();
        return sb.intesta(s);
        // return new Bloccato().intesta(s);
    }

    @Override
    public StatoBiglietto paga() {
        System.out.println("DISP Non si puo’ pagare, bisogna prima intestarlo");
        return this;
    }

    @Override
    public StatoBiglietto cancella() {
        System.out.println("DISP Lo stato era gia' Disponibile");
        return this;
    }
}
