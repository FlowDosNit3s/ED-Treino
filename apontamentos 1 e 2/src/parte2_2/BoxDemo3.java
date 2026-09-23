package parte2_2;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        Integer someInteger = integerBox.get(); //Nao precisa de Cast
        System.out.println(someInteger);
    }
}


/* Cast do BoxDemo1: Integer someInteger = (Integer)integerBox.get();
              Agora: Integer someInteger = integerBox.get();
    Sem o Cast
 */


/*
Podemos tentar adicionar um tipo incompatível à Box como por exemplo
String, nesse caso a compilação irá falhar alertando para o que anteriormente seria um
bug em tempo de execução:

BoxDemo3.java:5: add(java.lang.Integer) in Box<java.lang.Integer>
cannot be applied to (java.lang.String) integerBox.add("10");
 */

/*
Com string mas da o erro de cima
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add("10");
        Integer someInteger = integerBox.get(); //Nao precisa de Cast
        System.out.println(someInteger);
 */