public class Main {
    public static void main(String[] args) {
        FrascoContaGotas frasco = new FrascoContaGotas(50.0, 1.5);

        frasco.preencher(20.0);
        frasco.pingar();
        frasco.verificarRestante();
        frasco.esvaziar();
    }
}
