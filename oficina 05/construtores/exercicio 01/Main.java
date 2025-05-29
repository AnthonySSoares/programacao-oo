public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 25, "Brasil");
        Pessoa p2 = new Pessoa("Ana", 30, "México");
        Pessoa p3 = new Pessoa("Nicolas", 20, "EUA");
        Pessoa p4 = new Pessoa("Pedro", 18, "Japão");

        p1.exibir();
        p2.exibir();
        p3.exibir();
        p4.exibir();
    }
}
