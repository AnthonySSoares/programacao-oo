public class Main {
    public static void aplicarDesconto(Produto p) {
        p.preco -= 10; // altera o atributo do objeto
    }

    public static void main(String[] args) {
        Produto prod = new Produto(50);
        aplicarDesconto(prod);
        prod.exibir(); // Preço: 40
    }
}
