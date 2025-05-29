public class Cliente {
    private String nome;
    private Endereco endereco;  // composição

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        endereco.exibir();  // exibe endereço completo
        System.out.println();
    }
}
