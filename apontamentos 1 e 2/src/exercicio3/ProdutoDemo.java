package exercicio3;

public class ProdutoDemo {
    public static void main(String[] args) {
        Codigo<String, Integer> c1 = new Codigo<>("IMP", 34);
        ValorM preco1 = new ValorM(150.00, "EUR");

        ProdutoG2<Codigo<String, Integer>, ValorM> p1 = new ProdutoG2<>(c1, "Impressora HP", preco1);
        System.out.println(p1);
    }
}