package exercicio2;

public class ProdutoDemo {
    public static void main(String[] args) {
        Codigo<String, Integer> c1 = new Codigo<>("TER", 1232);
        Codigo<String, String> c2 = new Codigo<>("SEC", "1596");
        Codigo<Integer, Integer> c3 = new Codigo<>(141, 414);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        ProdutoG2<Codigo<String, Integer>, Double> p1 = new ProdutoG2<>(c1, "Teclado Mecanico", 50.00);
        ProdutoG2<Codigo<String, String>, Double> p2 = new ProdutoG2<>(c2, "Impressora", 120.0);
        ProdutoG2<Codigo<Integer, Integer>, Float> p3 = new ProdutoG2<>(c3, "Monitor", 199.90f);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}