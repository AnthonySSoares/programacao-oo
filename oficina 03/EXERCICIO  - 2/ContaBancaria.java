public class ContaBancaria {
    private String nomeTitular;
    private String numeroConta;
    private double saldo;
    private double limiteDiario;
    private double valorSacadoHoje;

    public ContaBancaria(String nome, String numero, double saldoInicial, double limite) {
        this.nomeTitular = nome;
        this.numeroConta = numero;
        this.saldo = saldoInicial;
        this.limiteDiario = limite;
        this.valorSacadoHoje = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else if (valorSacadoHoje + valor > limiteDiario) {
            System.out.println("Limite diário de saque excedido.");
        } else {
            saldo -= valor;
            valorSacadoHoje += valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void resetarLimiteDiario() {
        valorSacadoHoje = 0.0;
        System.out.println("Limite diário de saque foi resetado.");
    }
}
