/**
 * Classe que representa um jogador do jogo.
 * Armazena nome, número de tentativas e pontuação.
 */
public class Jogador {

    private String nome;

    private int tentativas;

    private int pontuacao;


    /**
     * Construtor da classe Jogador.
     * Inicializa o nome, tentativas e pontuação.
     *
     * @param nome O nome do jogador.
     */
    public Jogador(String nome) {
        this.nome = nome;

        this.tentativas = 0;

        this.pontuacao = 0;
    }


    /**
     * Retorna o nome do jogador.
     *
     * @return O nome do jogador.
     */
    public String getNome() {
        return nome;
    }


    /**
     * Define o nome do jogador.
     *
     * @param nome O nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    /**
     * Retorna o número de tentativas do jogador.
     *
     * @return O número de tentativas.
     */
    public int getTentativas() {
        return tentativas;
    }


    /**
     * Define o número de tentativas do jogador.
     *
     * @param tentativas O número de tentativas a ser definido.
     */
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    /**
     * Retorna a pontuação atual do jogador.
     *
     * @return A pontuação atual.
     */
    public int getPontuacao() {
        return pontuacao;
    }


    /**
     * Define a pontuação do jogador.
     *
     * @param pontuacao A pontuação a ser definida.
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }


    /**
     * Incrementa o número de tentativas realizadas pelo jogador.
     */
    public void incrementarTentativas() {
        this.tentativas++;
    }



    /**
     * Atualiza a pontuação do jogador com base no número de tentativas.
     * A fórmula utilizada é: 100 - (tentativas * 10).
     * A nova pontuação é somada à pontuação total existente.
     */
    public void atualizarPontuacao() {
        int novaPontuacao = 100 - (this.tentativas * 10);

        this.pontuacao += novaPontuacao;
    }

}
