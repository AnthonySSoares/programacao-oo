public class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public void exibir() {
        System.out.println("Rua: " + rua);
        System.out.println("Cidade: " + cidade);
    }
}
