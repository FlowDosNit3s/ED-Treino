package exercicio3;

public class ValorM {
    private double quantia;
    private String moeda;

    public ValorM(double quantia, String moeda) {
        this.quantia = quantia;
        this.moeda = moeda;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    @Override
    public String toString() {
        return quantia + " " + moeda;
    }
}
