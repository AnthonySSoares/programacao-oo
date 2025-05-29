public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("001", 500);
        Conta c2 = new Conta("002", -100); // saldo deve ser 0
        Conta c3 = new Conta("003", 1200);
        Conta c4 = new Conta("004", -50);  // saldo deve ser 0

        c1.exibir();
        c2.exibir();
        c3.exibir();
        c4.exibir();
    }
}
