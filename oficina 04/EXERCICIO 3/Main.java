public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno",15.99,5);
        Produto p2 = new Produto("Mouse", 89.90, 10);

        p1.exibir();
        p2.exibir();
    }
}