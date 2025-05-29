public class Main {
    public static void main(String[] args) {
        ArquivoTemporario a1 = new ArquivoTemporario("temp1.txt", 512, "Texto");
        ArquivoTemporario a2 = new ArquivoTemporario("imagem.tmp", 2048, "Imagem");
        ArquivoTemporario a3 = new ArquivoTemporario("audio.cache", 4096, "Áudio");

        a1.usar();
        a2.usar();
        a3.usar();

        a1 = null;
        a2 = null;
        a3 = null;

        System.gc(); // Solicita a coleta de lixo
        System.out.println("Final do método main. A coleta de lixo foi solicitada.");
    }
}
