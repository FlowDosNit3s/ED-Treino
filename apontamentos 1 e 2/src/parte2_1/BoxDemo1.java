package parte2_1;

public class BoxDemo1 {
    public static void main(String[] args) {
        //Apenas colocar objetos Integer nesta caixa
        Box integerBox = new Box();
        integerBox.add(new Integer(10));
        Integer someInteger = (Integer)integerBox.get();
        System.out.println(someInteger);
    }
}

/*
O programa parte2_1.BoxDemo1 cria um objeto Integer, passa-o para o add (linha 5) e
atribui esse mesmo objeto a someInteger pelo valor de retorno de get (linha 6). Em
seguida, imprime o valor do objeto (10) para o standard output (linha 7). Sabemos que a
conversão de Object para Integer está correta porque honramos o "contrato"
especificado no comentário. Mas lembre-se, o compilador não sabe nada acerca disso – o
compilador confia que a nossa conversão está correta.
 */