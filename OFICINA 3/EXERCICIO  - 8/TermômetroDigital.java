import java.util.LinkedList;

class TermometroDigital {
    private float temperaturaAtual;
    private String unidadeMedida;
    private LinkedList<Float> historico;

    public TermometroDigital(String unidadeInicial) {
        this.unidadeMedida = unidadeInicial;
        this.historico = new LinkedList<>();
    }

    public void registrarTemperatura(float valor) {
        this.temperaturaAtual = valor;
        if (historico.size() == 5) {
            historico.removeFirst();
        }
        historico.add(valor);
    }

    public void converterParaCelsius() {
        if (unidadeMedida.equals("F")) {
            temperaturaAtual = (temperaturaAtual - 32) * 5 / 9;
            unidadeMedida = "C";
        }
    }

    public void converterParaFahrenheit() {
        if (unidadeMedida.equals("C")) {
            temperaturaAtual = (temperaturaAtual * 9 / 5) + 32;
            unidadeMedida = "F";
        }
    }

    public void mostrarHistorico() {
        for (Float temp : historico) {
            System.out.println(temp + " " + unidadeMedida);
        }
    }

    public float getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
}
