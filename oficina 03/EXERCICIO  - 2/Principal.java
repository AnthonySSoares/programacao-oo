public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Saymon", "123456-7", 1000.0, 500.0);

        conta.consultarSaldo();
        conta.depositar(200);
        conta.sacar(300);
        conta.sacar(250);
        conta.resetarLimiteDiario();
        conta.sacar(250);
        conta.consultarSaldo();
    }
}