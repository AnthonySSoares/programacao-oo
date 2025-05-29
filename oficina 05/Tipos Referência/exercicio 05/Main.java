public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco("Manaus");
        Aluno a1 = new Aluno("João", end);
        Aluno a2 = new Aluno("Maria", end);

        a2.endereco.setCidade("Curitiba");

        a1.exibir(); // João mora em Manaus
        a2.exibir(); // Maria mora em Curitiba
    }
}
