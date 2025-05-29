public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", 328);
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 310);

        livro1.mostrarInformacoes();
        livro1.abrir();
        livro1.virarPagina();
        livro1.irParaPagina(45);
        livro1.fechar();
        livro1.mostrarInformacoes();

        livro2.mostrarInformacoes();
        livro2.abrir();
        livro2.irParaPagina(100);
        livro2.virarPagina();
        livro2.voltarPagina();
        livro2.fechar();
        livro2.mostrarInformacoes();
    }
}
