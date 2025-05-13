class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeMaxima;
    private int pessoasPresentes;

    public Elevador(int totalAndares, int capacidadeMaxima) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeMaxima = capacidadeMaxima;
        this.pessoasPresentes = 0;
    }

    public void entrar() {
        if (pessoasPresentes < capacidadeMaxima) {
            pessoasPresentes++;
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public void irParaAndar(int destino) {
        if (destino >= 0 && destino <= totalAndares && destino != andarAtual) {
            andarAtual = destino;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
}

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 5);

        System.out.println("Inicial:");
        mostrarEstado(elevador);

        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        System.out.println("\n3 pessoas entraram:");
        mostrarEstado(elevador);

        elevador.sair();
        System.out.println("\n1 pessoa saiu:");
        mostrarEstado(elevador);

        elevador.subir();
        elevador.subir();
        System.out.println("\nSubiu 2 andares:");
        mostrarEstado(elevador);

        elevador.descer();
        System.out.println("\nDesceu 1 andar:");
        mostrarEstado(elevador);

        elevador.irParaAndar(7);
        System.out.println("\nFoi para o andar 7:");
        mostrarEstado(elevador);

        elevador.irParaAndar(7);
        System.out.println("\nTentou ir para o mesmo andar (7):");
        mostrarEstado(elevador);

        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        System.out.println("\nTentou adicionar mais pessoas que a capacidade:");
        mostrarEstado(elevador);

        elevador.irParaAndar(0);
        elevador.descer();
        System.out.println("\nFoi para o terreo e tentou descer:");
        mostrarEstado(elevador);
    }

    public static void mostrarEstado(Elevador elevador) {
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
        System.out.println("Capacidade maxima: " + elevador.getCapacidadeMaxima());
        System.out.println("Total de andares: " + elevador.getTotalAndares());
    }
}
