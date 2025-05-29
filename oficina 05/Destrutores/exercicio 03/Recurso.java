public class Recurso {
    public Recurso() {
        System.out.println("Recurso criado.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Recurso coletado.");
        super.finalize();
    }
}
