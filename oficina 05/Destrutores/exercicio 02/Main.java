public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Item(i);
        }

        System.gc();
        System.out.println("Objetos criados. Aguardando GC...");
    }
}