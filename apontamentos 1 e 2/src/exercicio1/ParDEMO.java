package exercicio1;

public class ParDEMO {
    public static void main(String[] args) {
        Par<String, Double> aluno = new Par<>("Maria", 17.5);
        Par<Integer, String> funcionario = new Par<>(123, "Amaro");
        Par<Float, Float> coordenadas = new Par<>(23.344f, 42.405f); // float leva sempre "f" no fim
        Par<Boolean, String> check = new Par<>(true, "Pedro"); // bolimiano sempre minuscula
        Par<Double, Integer> mapa = new Par<>(80.5, 10);

        System.out.println(aluno.toString());
        System.out.println(funcionario.toString());
        System.out.println(coordenadas.toString());
        System.out.println(check.toString());
        System.out.println(mapa.toString());
    }

}
