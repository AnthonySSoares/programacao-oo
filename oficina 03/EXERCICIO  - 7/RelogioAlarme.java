public class RelogioAlarme {
    private String horaAtual;
    private String horaAlarme;
    private boolean alarmeAtivado;

    public void ajustarHora(String novaHora) {
        if (horaValida(novaHora)) {
            horaAtual = novaHora;
        }
    }

    public void ajustarAlarme(String horaAlarme) {
        if (horaValida(horaAlarme)) {
            this.horaAlarme = horaAlarme;
        }
    }

    public void ativarAlarme() {
        alarmeAtivado = true;
    }

    public void desativarAlarme() {
        alarmeAtivado = false;
    }

    public void verificarAlarme() {
        if (alarmeAtivado && horaAtual != null && horaAtual.equals(horaAlarme)) {
            System.out.println("Alarme tocando!");
        }
    }

    private boolean horaValida(String hora) {
        if (hora == null || !hora.matches("\\d{2}:\\d{2}")) {
            return false;
        }

        String[] partes = hora.split(":");
        int h = Integer.parseInt(partes[0]);
        int m = Integer.parseInt(partes[1]);

        return h >= 0 && h < 24 && m >= 0 && m < 60;
    }
}
