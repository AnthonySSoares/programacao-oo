public class Main {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();

        lamp.ligar();
        lamp.ajustarIntensidade(70);
        lamp.mudarCor("azul");

        lamp.desligar();
        lamp.ligar();
        lamp.desligar();
        lamp.ligar();
        lamp.ligar();
        lamp.ajustarIntensidade(90);
    }
}
