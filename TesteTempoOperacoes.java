public class TesteTempoOperacoes {

    public static void main(String[] args) {

        int[] quantidades = {1000000};
        Mapa<Integer, Veiculo> mapaVeiculos = new MapaListaDuplamenteEncadeada<>();
        
        for (int quantidade : quantidades) { // Adicionando o loop para cada quantidade de veículos

            // Inserção dos veículos
            long inicio10 = System.nanoTime();
            for (int i = 0; i < quantidade; i++) { 
                Veiculo v = new Veiculo(); 
                mapaVeiculos.put(v.getChassi(), v);
            }
            long fim10 = System.nanoTime();
            long duracao10 = (fim10 - inicio10);
           
            // Apresentação dos veículos gerados
            System.out.println("\n------------Todos os veículos gerados para " + quantidade + " veículos:");
            long começo2 = System.nanoTime();
            for (int i = 0; i < quantidade; i++) {
                Veiculo veiculo = mapaVeiculos.get(i);
                if (veiculo != null) {
                    System.out.println(veiculo);
                }
            }
            long fim2 = System.nanoTime();
            long duração2 = (fim2 - começo2);
            
            // Método para remover os veículos com número de chassi igual ou inferior à 202050000
            System.out.println("\n------------Lista após a remoção dos veículos de chassi igual ou inferior à 202050000:");
            long começo4 = System.nanoTime();
            for (int i = 0; i < quantidade; i++) {
                Veiculo veiculo = mapaVeiculos.get(i);
                if (veiculo != null && veiculo.getChassi() <= 202050000) {
                    mapaVeiculos.remove(veiculo.getChassi());
                }
            }
            // Lista com veículos removidos
            for (int i = 0; i < quantidade; i++) {
                Veiculo veiculo = mapaVeiculos.get(i);
                if (veiculo != null) {
                    System.out.println(veiculo);
                }
            }
            long fim4 = System.nanoTime();
            long duração4 = (fim4 - começo4);
       
            System.out.println("\nTempo para inserir " + quantidade + " veículos: " + duracao10 + " nanossegundos");
            System.out.println("\nTempo para apresentar os veículos gerados: " + duração2 + " nanossegundos");
            
            // Método para verificar quantos veículos da marca Ford existem no mapa
long começo3 = System.nanoTime();
int carrosFord = 0;
for (int i = 0; i < quantidade; i++) {
    Veiculo veiculo = mapaVeiculos.get(i);
    if (veiculo != null && veiculo.isMarcaFord()) {
        carrosFord++;
    }
}
System.out.println("\nNúmero de carros da marca Ford: " + carrosFord);
long fim3 = System.nanoTime();
long duração3 = (fim3 - começo3);
System.out.println("\nTempo para verificar quantos veículos da marca Ford existem: " + duração3 + " nanossegundos");
System.out.println("\nTempo para verificar e remover os chassis iguais ou inferiores à 2020500: " + duração4 + " nanossegundos");

        }
    }
}
