import java.util.Random;

/**
 * Classe que representa um jogo de adivinhação.
 * Cada instância do jogo possui um número secreto a ser adivinhado por um jogador.
 */
public class Jogo {
    private Jogador jogador;

        private int numeroSecreto;




    /**
     * Construtor da classe Jogo.
     * Gera um número secreto aleatório entre 1 e 100.
     *
     * @param jogador O jogador que participará deste jogo.
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;

        Random rand = new Random();

        this.numeroSecreto = rand.nextInt(100) + 1;
    }



    /**
     * Realiza uma tentativa do jogador para adivinhar o número secreto.
     * Incrementa o número de tentativas do jogador e retorna o resultado da tentativa.
     *
     * @param tentativa O número informado pelo jogador.
     * @return "Maior" se o número secreto for maior que a tentativa,
     *         "Menor" se for menor, ou "Acertou!" se o jogador acertar.
     */
    public String jogar(int tentativa) {

        jogador.incrementarTentativas();

            System.out.println("Número secreto: " + numeroSecreto);

        if (tentativa < numeroSecreto) {
            return "Maior";

        } else if (tentativa > numeroSecreto) {
            return "Menor";

        } else {

            jogador.atualizarPontuacao();

                return "Acertou!";
        }

    }

}
