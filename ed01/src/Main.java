import java.util.Scanner;

/**
 * Classe principal que executa o jogo de adivinhação e gerencia o placar dos jogadores.
 */
public class Main {

    /**
     * Método principal que inicia a aplicação.
     *
     * @param args argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();
        boolean continuarJogando = true;

        while (continuarJogando) {

            System.out.print("Digite o nome do jogador: ");
            String nomeJogador = teclado.nextLine();

            Jogador jogador = placar.buscarJogador(nomeJogador);
            if (jogador == null) {
                jogador = new Jogador(nomeJogador);
            }


            Jogo jogo = new Jogo(jogador);


            boolean acertou = false;
            while (!acertou) {
                System.out.print("Digite seu palpite (1 a 100): ");
                int tentativa = teclado.nextInt();
                String resultado = jogo.jogar(tentativa);
                System.out.println(resultado);

                if (resultado.equals("Acertou!")) {
                    acertou = true;
                    System.out.println("Você acertou o número! Tentativas: " + jogador.getTentativas());
                    jogador.atualizarPontuacao();
                    placar.adicionarJogador(jogador);
                    placar.mostrarRanking();
                }
            }

            System.out.print("\nDeseja jogar novamente? (sim/não): ");
            teclado.nextLine();
            String resposta = teclado.nextLine();
            if (resposta.equalsIgnoreCase("não")) {
                continuarJogando = false;
            }
        }

        teclado.close();
        System.out.println("\nObrigado por jogar!");
    }
}
