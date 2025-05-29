public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana");
        Pessoa p2 = new Pessoa("Ana");

        System.out.println(p1 == p2);        
        System.out.println(p1.equals(p2));   
    }
}
