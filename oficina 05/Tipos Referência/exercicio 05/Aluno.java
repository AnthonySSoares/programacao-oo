public class Aluno {
    private String nome;
    public Endereco endereco;

    public Aluno(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = new Endereco(endereco); // deep copy
    }

    public void exibir() {
        System.out.println(nome + " mora em " + endereco.getCidade());
    }
}
