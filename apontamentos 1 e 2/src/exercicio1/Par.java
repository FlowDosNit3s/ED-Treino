package exercicio1;

public class Par<T, U> {
    private T primeiro;
    private U segundo;

    public Par(T primeiro, U segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public T getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public U getSegundo() {
        return this.segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "(" + primeiro + ", " + segundo + ")";
    }

}
