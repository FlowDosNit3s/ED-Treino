package exercicio4;

public class Dicionario<K, V> {
    private K[] chaves;
    private V[] valores;
    private int numElementos;

    @SuppressWarnings("unchecked")
    public Dicionario(int capacidade) {
        chaves = (K[]) new Object[capacidade];
        valores = (V[]) new Object[capacidade];
        numElementos = 0;
    }

    public Dicionario() {
        this(10); // Inicializa com tamanho 10
    }

    public V get(K chave) {
        for (int i = 0; i < numElementos; i++) {
            if (chaves[i].equals(chave)) {// tenho de usar equals porque temos de Comparar o Conteúdo Real e nao o
                                          // endereço de memoria (==)
                return valores[i];
            }
        }
        return null;
    }

    public void add(K chave, V valor) {
        for (int i = 0; i < numElementos; i++) {
            if (chaves[i].equals(chave)) {
                valores[i] = valor;
                return; // retorna valor atualizado
            }
        }

        if (numElementos < chaves.length) {
            chaves[numElementos] = chave;
            valores[numElementos] = valor;
            numElementos++;
        }
    }
}
