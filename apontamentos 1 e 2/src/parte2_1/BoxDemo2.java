package parte2_1;

public class BoxDemo2 {
    public static void main(String[] args) {
        //Apenas colocar objetos Integer nesta caixa
        Box integerBox = new Box();
        //Imagina que esta é uma parte de uma grande aplicação
        // modificada por um programador.
        integerBox.add("10"); // Repare que o tipo é agora String
        // ... e esta é outra, talvez escrita
        // por um programador diferente
        Integer someInteger = (Integer)integerBox.get();
        System.out.println(someInteger);
    }
}

/*
No exemplo parte2_1.BoxDemo2, armazenamos o número 10 como uma String (linha
10), o que pode ser o caso quando, digamos, uma interface gráfica (GUI) armazena o valor de
entrada de um determinado utilizador. No entanto, a conversão existente de Object para
Integer irá falhar. Este é um problema muito comum que passa facilmente despercebido
já que o código compila e é impossível sabermos qual o problema até chegarmos ao tempo
de execução.
 */