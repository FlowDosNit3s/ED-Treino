package parte2_4;

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U> void inspect(U u){
        System.out.println("T: " +t.getClass().getName());
        System.out.println("U: " +u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        integerBox.inspect("some text");
    }
}

/*
T: java.lang.Integer  porque usamos t.getClass().getName() e é
                      um parâmetro genérico de nível de classe
                      resolvido como Integer na criação do objeto.

U: java.lang.String   porque usamos u.getClass().getName() e é
                      um parâmetro genérico de nível de método resolvido
                      como String com base no argumento passado na chamada.

 PS: se coloca-se por exemplo o <u> para ser integer ele ia devolver integer?
    Sim, devolveria java.lang.Integer

    integerBox.inspect(123);
    ou
    integerBox.inspect(Integer.valueOf(123));

    O parâmetro U adapta-se a qualquer tipo de objeto
    que seja passado como argumento nessa chamada específica
    (ex.: Double, Boolean, ou outra classe customizada).
 */