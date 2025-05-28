import java.util.ArrayList;

/**
 * Classe responsável por gerenciar o ranking dos jogadores.
 */
public class Placar {

    private ArrayList<Jogador> ranking;


    /**
     * Construtor da classe Placar.
     * Inicializa a lista de jogadores do ranking.
     */
    public Placar() {

        ranking = new ArrayList<>();

    }

    /**
     * Busca um jogador no ranking pelo nome.
     *
     * @param nome O nome do jogador a ser buscado.
     * @return O objeto Jogador correspondente, ou null se não encontrado.
     */
    public Jogador buscarJogador(String nome) {

        for (Jogador jogadorExistente : ranking) {

            if (jogadorExistente.getNome().equals(nome)) {
                return jogadorExistente;

            }

        }

        return null;
    }



    /**
     * Adiciona um jogador ao ranking ou atualiza a pontuação se ele já existir.
     *
     * @param j O jogador a ser adicionado ou atualizado.
     */
    public void adicionarJogador(Jogador j) {
        Jogador jogadorExistente = buscarJogador(j.getNome());

        if (jogadorExistente != null) {

            jogadorExistente.atualizarPontuacao();

        } else {

            ranking.add(j);
        }

    }


    /**
     * Exibe o ranking atual de jogadores com suas respectivas pontuações.
     */
    public void mostrarRanking() {

            System.out.println("\n--- Ranking ---");

        for (Jogador jogador : ranking) {
            System.out.println(jogador.getNome() + " - Pontuação: " + jogador.getPontuacao());

        }

    }

}
