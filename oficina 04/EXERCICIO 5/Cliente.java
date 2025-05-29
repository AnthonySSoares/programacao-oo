class Cliente {
    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        endereco.exibir();
    }
}

