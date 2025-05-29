public class Item {
    private int id;

    public Item(int id) {
        this.id = id;
        System.out.println("Item criado: " + id);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Item coletado pelo GC: " + id);
        super.finalize();
    }
}
