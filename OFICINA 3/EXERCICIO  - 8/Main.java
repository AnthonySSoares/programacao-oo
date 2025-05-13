class Main {
    public static void main(String[] args) {
        TermometroDigital termo = new TermometroDigital("C");

        termo.registrarTemperatura(25);
        termo.registrarTemperatura(26);
        termo.registrarTemperatura(24);
        termo.registrarTemperatura(23);
        termo.registrarTemperatura(22);
        termo.registrarTemperatura(21);

        termo.mostrarHistorico();

        termo.converterParaFahrenheit();
        System.out.println("Temperatura atual: " + termo.getTemperaturaAtual() + " " + termo.getUnidadeMedida());
    }
}
