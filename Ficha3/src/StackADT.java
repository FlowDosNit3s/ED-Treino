package Ficha3.src;

import Ficha3.src.Exceptions.EmptyCollectionException;

/**
 * Interface que define o Tipo Abstrato de Dados (ADT) para uma Pilha (Stack).
 * Funciona segundo o princípio LIFO (Last In, First Out).
 *
 * @param <T> o tipo dos elementos guardados na pilha
 */
public interface StackADT<T> {

    /**
     * Adiciona um elemento ao topo da pilha.
     *
     * @param element elemento a ser inserido na pilha
     */
    public void push(T element);

    /**
     * Remove e devolve o elemento no topo da pilha.
     *
     * @return o elemento removido do topo da pilha
     */
    public T pop() throws EmptyCollectionException;

    /**
     * Devolve o elemento no topo da pilha sem o remover.
     *
     * @return o elemento no topo da pilha
     */
    public T peek() throws EmptyCollectionException;

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha não contiver elementos, false caso contrário
     */
    public boolean isEmpty();

    /**
     * Devolve o número de elementos presentes na pilha.
     *
     * @return o número de elementos na pilha
     */
    public int size();

    /**
     * Devolve uma representação em formato String da pilha.
     *
     * @return a representação textual da pilha
     */
    public String toString();
}
