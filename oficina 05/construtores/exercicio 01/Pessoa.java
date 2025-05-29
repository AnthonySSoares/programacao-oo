public class Pessoa {
    private String nome;
    private int idade;
    private String nacionalidade;

    // Construtor com 3 parâmetros
    public Pessoa(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println();
    }
}
