public class Biglietto {
    private String codice = "XYZ";
    private int prezzo = 100;

    private StatoBiglietto sb = new Disponibile();

    public void mostra() {
        System.out.println("Prezzo: " + prezzo + "  codice: " + codice);
        sb.mostra();
    }

    public void prenota(String s) {
        sb = sb.intesta(s);
    }

    public void cancella() {
        sb = sb.cancella();
    }

    public void compra() {
        sb = sb.paga();
    }
}
