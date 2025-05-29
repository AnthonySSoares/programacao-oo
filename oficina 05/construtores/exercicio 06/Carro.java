public class Carro {
    private String modelo;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo; // "this.modelo" é o atributo, "modelo" é o parâmetro
        this.ano = ano;       // mesmo para o ano
    }

    public void exibir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
