public class Conta {
    private String numero;
    private double saldoInicial;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        // Validação: se saldoInicial negativo, atribui 0
        if (saldoInicial < 0) {
            this.saldoInicial = 0;
        } else {
            this.saldoInicial = saldoInicial;
        }
    }

    public void exibir() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo inicial: R$ " + saldoInicial);
        System.out.println();
    }
}
