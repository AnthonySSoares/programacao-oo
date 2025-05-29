public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Civic", 2021);
        Carro c2 = new Carro("Corolla", 2019);
        Carro c3 = new Carro("Gol", 2015);
        Carro c4 = new Carro("Fiesta", 2018);

        c1.exibir();
        System.out.println();
        c2.exibir();
        System.out.println();
        c3.exibir();
        System.out.println();
        c4.exibir();
    }
}
