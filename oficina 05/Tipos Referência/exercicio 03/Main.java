public class Main {
    public static void redefinirProduto(Produto p) {
        p = new Produto(999); 
    }

    public static void main(String[] args) {
        Produto p1 = new Produto(50);
        redefinirProduto(p1);
        p1.exibir(); 
    }
}
