package parte2_2;

public class Box<T> {
    private T t; // T é de tipo;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return this.t;
    }
}
