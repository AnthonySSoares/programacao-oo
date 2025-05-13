public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;

    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 1;
        this.aberto = false;
    }

    public void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println("Livro \"" + titulo + "\" aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println("Livro \"" + titulo + "\" fechado.");
        }
    }

    public void virarPagina() {
        if (aberto && paginaAtual < totalPaginas) {
            paginaAtual++;
            System.out.println("Virou para a página " + paginaAtual + " do livro \"" + titulo + "\"");
        }
    }

    public void voltarPagina() {
        if (aberto && paginaAtual > 1) {
            paginaAtual--;
            System.out.println("Voltou para a página " + paginaAtual + " do livro \"" + titulo + "\"");
        }
    }

    public void irParaPagina(int pagina) {
        if (aberto && pagina >= 1 && pagina <= totalPaginas) {
            paginaAtual = pagina;
            System.out.println("Indo para a página " + paginaAtual + " do livro \"" + titulo + "\"");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("---------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + totalPaginas);
        System.out.println("Página atual: " + paginaAtual);
        System.out.println("Está aberto: " + (aberto ? "Sim" : "Não"));
    }
}
