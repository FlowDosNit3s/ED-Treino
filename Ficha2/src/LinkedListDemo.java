package Ficha2.src;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("=== 1. TESTE: LISTA INICIALMENTE VAZIA ===");
        System.out.println("Está vazia? " + list.isEmpty());
        System.out.print("Conteúdo da lista: ");
        list.print();
        System.out.println();

        System.out.println("=== 2. TESTE: INSERÇÃO COM ADD ===");
        System.out.println("A adicionar: Diogo, Silva, Costa, Ramos...");
        list.add("Diogo");
        list.add("Silva");
        list.add("Costa");
        list.add("Ramos");
        System.out.println("Está vazia? " + list.isEmpty());
        System.out.print("Conteúdo da lista: ");
        list.print();
        System.out.println();

        System.out.println("\n=== 3. TESTE: REMOVER ELEMENTO DO MEIO ('Silva') ===");
        boolean removeuMeio = list.remove("Silva");
        System.out.println("Removeu 'Silva'? " + removeuMeio);
        System.out.print("Conteúdo da lista: ");
        list.print();
        System.out.println();

        System.out.println("\n=== 4. TESTE: REMOVER PRIMEIRO ELEMENTO ('Diogo' - head) ===");
        boolean removeuHead = list.remove("Diogo");
        System.out.println("Removeu 'Diogo'? " + removeuHead);
        System.out.print("Conteúdo da lista: ");
        list.print();
        System.out.println();

        System.out.println("\n=== 5. TESTE: REMOVER ÚLTIMO ELEMENTO ('Ramos') ===");
        boolean removeuFim = list.remove("Ramos");
        System.out.println("Removeu 'Ramos'? " + removeuFim);
        System.out.print("Conteúdo da lista: ");
        list.print();
        System.out.println();

        System.out.println("\n=== 6. TESTE: TENTAR REMOVER ELEMENTO INEXISTENTE ('Teste') ===");
        boolean removeuInexistente = list.remove("Teste");
        System.out.println("Removeu 'Teste'? " + removeuInexistente);
        System.out.print("Conteúdo da lista: ");
        list.print();
        System.out.println();

        System.out.println("\n=== 7. TESTE: REMOVER O ÚLTIMO ELEMENTO RESTANTE ('Costa') ===");
        boolean removeuUltimo = list.remove("Costa");
        System.out.println("Removeu 'Costa'? " + removeuUltimo);
        System.out.print("Conteúdo da lista: ");
        list.print();

        System.out.println("\n=== 8. TESTE: REMOVER DE LISTA VAZIA ===");
        boolean removeuVazio = list.remove("QualquerCoisa");
        System.out.println("Removeu de lista vazia? " + removeuVazio);
    }
}