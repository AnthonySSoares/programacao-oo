public class ArquivoTemporario {
    private String nome;
    private long tamanho;
    private String tipo;

    public ArquivoTemporario(String nome, long tamanho, String tipo) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        System.out.println("Arquivo criado: " + nome + " | Tipo: " + tipo + " | Tamanho: " + tamanho + "KB");
    }

    public void usar() {
        System.out.println("Abrindo " + nome + " para uso...");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Liberando recurso do arquivo: " + nome);
        System.out.println("Arquivo de tipo " + tipo + " foi finalizado.");
        super.finalize();
    }
}
