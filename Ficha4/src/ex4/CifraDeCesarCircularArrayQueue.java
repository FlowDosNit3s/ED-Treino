package Ficha4.src.ex4;

import Ficha4.src.Exceptions.EmptyCollectionException;
import Ficha4.src.ex2.CircularArrayQueue;

public class CifraDeCesarCircularArrayQueue {

    /**
     * Codifica uma mensagem aplicando uma chave de repetição armazenada numa Queue.
     */
    public static String codificar(String mensagem, int[] chave) throws EmptyCollectionException {
        // 1. Criar a fila e inserir todos os elementos da chave
        CircularArrayQueue<Integer> keyQueue = new CircularArrayQueue<>();
        for (int k : chave) {
            keyQueue.enqueue(k);
        }

        String resultado = "";

        // 2. Percorrer cada caractere da mensagem
        for (int i = 0; i < mensagem.length(); i++) {
            char originalChar = mensagem.charAt(i);

            // Tirar a chave do início da fila
            int shift = keyQueue.dequeue();

            // Codificar somando o shift
            char encodedChar = (char) (originalChar + shift);
            resultado += encodedChar;

            // Voltar a colocar a chave no fim da fila para rodar
            keyQueue.enqueue(shift);
        }

        return resultado;
    }

    /**
     * Descodifica uma mensagem codificada fazendo o processo inverso.
     */
    public static String descodificar(String mensagemCodificada, int[] chave) throws EmptyCollectionException {
        // 1. Criar a fila e inserir todos os elementos da chave
        CircularArrayQueue<Integer> keyQueue = new CircularArrayQueue<>();
        for (int k : chave) {
            keyQueue.enqueue(k);
        }

        String resultado = "";

        // 2. Percorrer cada caractere da mensagem codificada
        for (int i = 0; i < mensagemCodificada.length(); i++) {
            char encodedChar = mensagemCodificada.charAt(i);

            // Tirar a chave do início da fila
            int shift = keyQueue.dequeue();

            // Descodificar subtraindo o shift
            char originalChar = (char) (encodedChar - shift);
            resultado += originalChar;

            // Voltar a colocar a chave no fim da fila
            keyQueue.enqueue(shift);
        }

        return resultado;
    }

    public static void main(String[] args) throws EmptyCollectionException {
        String mensagemOriginal = "knowledge is power";
        int[] chave = {3, 1, 7, 4, 2, 5};

        System.out.println("Mensagem Original:   " + mensagemOriginal);

        // Codificar
        String mensagemCodificada = codificar(mensagemOriginal, chave);
        System.out.println("Mensagem Codificada: " + mensagemCodificada);

        // Descodificar
        String mensagemDescodificada = descodificar(mensagemCodificada, chave);
        System.out.println("Mensagem Descodificada: " + mensagemDescodificada);
    }
}
