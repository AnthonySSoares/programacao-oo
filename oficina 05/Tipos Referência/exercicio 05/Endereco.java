public class Endereco {
    private String cidade;

    public Endereco(String cidade) {
        this.cidade = cidade;
    }

    public Endereco(Endereco outro) {
        this.cidade = outro.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }
}
