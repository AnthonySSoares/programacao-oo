public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("001", 500);
        Conta c2 = new Conta("002", -100); 
        Conta c3 = new Conta("003", 350);
        Conta c4 = new Conta("003", 1400);
        
        c1.exibir();
        c2.exibir();
        c3.exibir();
        c4.exibir();
    }
    
}