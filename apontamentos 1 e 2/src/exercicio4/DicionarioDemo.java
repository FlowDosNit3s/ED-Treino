package exercicio4;

public class DicionarioDemo {
    public static void main(String[] args) {
        // Criar um Dicionário <String, String> para automóveis (matrícula -> modelo)
        Dicionario<String, String> dicCarros = new Dicionario<>();

        // Adicionar elementos
        dicCarros.add("AA-00-11", "Toyota Corolla");
        dicCarros.add("99-ZZ-88", "BMW Série 3");
        dicCarros.add("12-AB-34", "Tesla Model 3");

        // Procurar elementos por chave
        System.out.println("Matrícula AA-00-11: " + dicCarros.get("AA-00-11"));
        System.out.println("Matrícula 99-ZZ-88: " + dicCarros.get("99-ZZ-88"));

        // Testar chave inexistente (retorna null)
        System.out.println("Matrícula 00-00-00: " + dicCarros.get("00-00-00"));

        // Atualizar o valor de uma chave existente
        dicCarros.add("AA-00-11", "Toyota Yaris (Atualizado)");
        System.out.println("Matrícula AA-00-11 (após atualização): " + dicCarros.get("AA-00-11"));
    }
}
