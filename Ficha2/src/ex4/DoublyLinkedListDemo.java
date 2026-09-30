package Ficha2.src.ex4;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        System.out.println("--- 1. TESTE: LISTA VAZIA ---");
        System.out.println("Está vazia? " + list.isEmpty());
        System.out.print("Conteúdo: ");
        list.print();

        System.out.println("\n--- 2. TESTE: INSERIR NA CABEÇA (addFirst) ---");
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");
        System.out.println("Está vazia? " + list.isEmpty());
        System.out.print("Conteúdo (esperado: A B C): ");
        list.print();

        System.out.println("\n--- 3. TESTE: INSERIR NO FIM (addLast) ---");
        list.addLast("D");
        System.out.print("Conteúdo (esperado: A B C D): ");
        list.print();

        System.out.println("\n--- 4. TESTE: REMOVER O PRIMEIRO (removeFirst) ---");
        boolean removeu1 = list.removeFirst();
        System.out.println("Removeu primeiro? " + removeu1);
        System.out.print("Conteúdo (esperado: B C D): ");
        list.print();

        System.out.println("\n--- 5. TESTE: REMOVER O ÚLTIMO (removeLast) ---");
        boolean removeuUltimo = list.removeLast();
        System.out.println("Removeu último? " + removeuUltimo);
        System.out.print("Conteúdo (esperado: B C): ");
        list.print();

        System.out.println("\n--- 6. TESTE: ESVAZIAR A LISTA ---");
        list.removeFirst(); // tira B
        list.removeLast();  // tira C (último nó restante)
        System.out.println("Está vazia? " + list.isEmpty());
        System.out.print("Conteúdo: ");
        list.print();

        System.out.println("\n--- 7. TESTE: REMOVER EM LISTA VAZIA ---");
        System.out.println("Remover primeiro em lista vazia? " + list.removeFirst());
        System.out.println("Remover último em lista vazia? " + list.removeLast());
    }
}
