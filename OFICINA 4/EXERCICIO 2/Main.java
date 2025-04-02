public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        l1.exibir();
        l2.exibir();
        
        Livro l3 = new Livro();
        Livro l4 = new Livro("1984", "George Orwell", 1949);

        l3.exibir();
        l4.exibir();
    }
}