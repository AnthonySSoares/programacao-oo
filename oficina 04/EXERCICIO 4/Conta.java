public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    public void exibir() {
        System.out.println("Conta: " + numero + " | Saldo: R$ " + saldo);
    }
}
