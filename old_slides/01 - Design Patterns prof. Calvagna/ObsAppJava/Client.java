// Classe con il main che usa il design pattern
public class Client {
    private Registro r = new Registro();
    private Monitor m = new Monitor();

    public static void main(String[] args) {
        Client c = new Client();
        c.test();
    }

    private void test() {
        r.addObserver(m);
        r.ritira(500);

        r.deposita(1200);
        r.deposita(500);
        System.out.println("Saldo attuale: " + r.getBilancio() + " euro");
        System.out.println("Il subject ha effettuato " + m.getNumOperazioni() + " operazioni");
    }
}
