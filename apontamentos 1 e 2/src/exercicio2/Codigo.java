package exercicio2;

public class Codigo<T, U> {
    private T t;
    private U u;

    public Codigo(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return this.t;
    }

    public U getU() {
        return this.u;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setU(U u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return "" + t + u;
    }
}
