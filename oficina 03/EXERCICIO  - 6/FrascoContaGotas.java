public class FrascoContaGotas {
    private double capacidadeTotal;
    private double quantidadeAtual;
    private double tamanhoDosePadrao;

    public FrascoContaGotas(double capacidadeTotal, double tamanhoDosePadrao) {
        this.capacidadeTotal = capacidadeTotal;
        this.quantidadeAtual = 0.0;
        this.tamanhoDosePadrao = tamanhoDosePadrao;
    }

    public void pingar() {
        if (quantidadeAtual >= tamanhoDosePadrao) {
            quantidadeAtual -= tamanhoDosePadrao;
            System.out.println("Uma dose foi pingada. Quantidade restante: " + quantidadeAtual + " ml.");
        } else {
            System.out.println("Não há dose suficiente para pingar.");
        }
    }

    public void preencher(double quantidade) {
        if (quantidadeAtual + quantidade <= capacidadeTotal) {
            quantidadeAtual += quantidade;
            System.out.println("Frasco preenchido com " + quantidade + " ml. Total: " + quantidadeAtual + " ml.");
        } else {
            System.out.println("Erro: ultrapassa a capacidade total do frasco.");
        }
    }

    public int verificarRestante() {
        int doses = (int) (quantidadeAtual / tamanhoDosePadrao);
        System.out.println("Doses restantes: " + doses);
        return doses;
    }

    public void esvaziar() {
        quantidadeAtual = 0.0;
        System.out.println("Frasco esvaziado.");
    }

    public double getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public double getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public double getTamanhoDosePadrao() {
        return tamanhoDosePadrao;
    }
}
