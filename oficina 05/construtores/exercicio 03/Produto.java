public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor com 3 parâmetros
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor com 1 parâmetro, que chama o outro construtor com valores padrão
    public Produto(String nome) {
        this(nome, 10.0, 1);  // preco padrão 10.0, quantidade padrão 1
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println();
    }
}
