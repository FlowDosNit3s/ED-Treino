package Ficha2.src.ex2;

public class SentinelLinkedListDemo {
    public static void main(String[] args) {
        SentinelLinkedList<String> list = new SentinelLinkedList<>();

        System.out.println("--- TESTE: LISTA VAZIA ---");
        System.out.println("Está vazia? " + list.isEmpty());
        System.out.print("Conteúdo: ");
        list.print();
        System.out.println();

        System.out.println("\n--- TESTE: ADICIONAR ELEMENTOS ---");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Está vazia? " + list.isEmpty());
        System.out.print("Conteúdo: ");
        list.print();
        System.out.println();

        System.out.println("\n--- TESTE: REMOVER ELEMENTO NO MEIO (B) ---");
        boolean removeB = list.remove("B");
        System.out.println("Removeu 'B'? " + removeB);
        System.out.print("Conteúdo: ");
        list.print();
        System.out.println();

        System.out.println("\n--- TESTE: REMOVER PRIMEIRO ELEMENTO (A) ---");
        boolean removeA = list.remove("A");
        System.out.println("Removeu 'A'? " + removeA);
        System.out.print("Conteúdo: ");
        list.print();
        System.out.println();

        System.out.println("\n--- TESTE: REMOVER ÚLTIMO ELEMENTO (D) ---");
        boolean removeD = list.remove("D");
        System.out.println("Removeu 'D'? " + removeD);
        System.out.print("Conteúdo: ");
        list.print();
        System.out.println();

        System.out.println("\n--- TESTE: TENTAR REMOVER ELEMENTO INEXISTENTE ---");
        boolean removeX = list.remove("X");
        System.out.println("Removeu 'X'? " + removeX);
        System.out.print("Conteúdo: ");
        list.print();
        System.out.println();

        System.out.println("\n--- TESTE: REMOVER O ÚLTIMO ELEMENTO RESTANTE (C) ---");
        boolean removeC = list.remove("C");
        System.out.println("Removeu 'C'? " + removeC);
        System.out.print("Conteúdo: ");
        list.print();
        System.out.println();

        System.out.println("\n--- TESTE: REMOVER DE LISTA VAZIA ---");
        boolean removeVazio = list.remove("Qualquer");
        System.out.println("Removeu de lista vazia? " + removeVazio);
        System.out.print("Conteúdo: ");
        list.print();
        System.out.println();
    }
}
