public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Matrix", 120);

        filme.reproduzir();
        System.out.println("Reproduzindo... Minuto atual: " + filme.getMinutoAtual());

        filme.avancar(30);
        System.out.println("Avancou 30 minutos. Minuto atual: " + filme.getMinutoAtual());

        filme.pausar();
        System.out.println("Pausado. Minuto atual: " + filme.getMinutoAtual());

        filme.reproduzir();
        System.out.println("Reproduzindo novamente. Minuto atual: " + filme.getMinutoAtual());

        filme.voltar(10);
        System.out.println("Voltou 10 minutos. Minuto atual: " + filme.getMinutoAtual());

        filme.reiniciar();
        System.out.println("Filme reiniciado. Minuto atual: " + filme.getMinutoAtual());
    }
}
