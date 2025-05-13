public class Main {
    public static void main(String[] args) {
        RelogioAlarme relogio = new RelogioAlarme();
        relogio.ajustarHora("07:30");
        relogio.ajustarAlarme("07:30");
        relogio.ativarAlarme();
        relogio.verificarAlarme();
    }
}
