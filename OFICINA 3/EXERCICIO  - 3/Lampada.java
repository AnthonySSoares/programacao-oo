public class Lampada {
    private boolean ligada = false;
    private int intensidade = 0;
    private String cor = "branco";
    private int contadorLigDesl = 0;
    private boolean queimada = false;

    public void ligar() {
        if (!ligada && !queimada) {
            ligada = true;
            contadorLigDesl++;
            verificarQueimada();
            System.out.println("Lampada ligada.");
        } else if (queimada) {
            System.out.println("A lampada esta queimada e nao pode ser ligada.");
        }
    }

    public void desligar() {
        if (ligada && !queimada) {
            ligada = false;
            contadorLigDesl++;
            verificarQueimada();
            System.out.println("Lampada desligada.");
        } else if (queimada) {
            System.out.println("A lampada esta queimada e nao pode ser desligada.");
        }
    }

    public void ajustarIntensidade(int valor) {
        if (ligada && !queimada) {
            if (valor >= 0 && valor <= 100) {
                intensidade = valor;
                System.out.println("Intensidade ajustada para " + intensidade + "%.");
            } else {
                System.out.println("Valor invalido. A intensidade deve estar entre 0 e 100.");
            }
        } else if (!ligada) {
            System.out.println("Ajuste de intensidade falhou. A lampada esta desligada.");
        } else {
            System.out.println("A lampada esta queimada.");
        }
    }

    public void mudarCor(String novaCor) {
        cor = novaCor;
        System.out.println("Cor da luz alterada para " + cor + ".");
    }

    private void verificarQueimada() {
        if (contadorLigDesl >= 5) {
            queimada = true;
            ligada = false;
            System.out.println("A lampada queimou.");
        }
    }
}
