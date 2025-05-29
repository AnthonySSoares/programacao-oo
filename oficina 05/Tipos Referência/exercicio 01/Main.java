public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1000);
        Conta c2 = c1; // c2 e c1 apontam para o mesmo objeto

        c2.depositar(500); // altera o saldo do objeto referenciado por c2 (que é o mesmo de c1)

        c1.exibir(); // Saldo: 1500
        c2.exibir(); // Saldo: 1500
    }
}
