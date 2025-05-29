public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor padrão (sem parâmetros)
    public Livro() {
        this.titulo = "O Alquimista";
        this.autor = "Paulo Coelho";
        this.anoPublicacao = 1988;
    }

    // Construtor com parâmetros (sobrecarga)
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para exibir os dados do livro
    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println();
    }
}
