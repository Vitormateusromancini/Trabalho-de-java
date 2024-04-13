



//*Para cada estrutura de dados deve ser medido o tempo total gasto para cada uma das
//seguintes operações (usar o método System.nanoTime() para ser mais preciso):
//• Inserir 10, 100, 1.000, 100.000 e 1.000.000 de veículos;
//• Apresentar todos os veículos;
//• Verificar quantos veículos são da marca Ford;
//• Remover todos os veículos com número de chassi igual ou inferior à 202050000.

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int quantidade = 10;
        MapaHashVetor <Integer, Veiculo> mapaVeiculos = new MapaHashVetor <Integer, Veiculo>();
        
        // 1)------------Inserção dos veículos------------------------------------------------
        long inicio10 = System.nanoTime();
       
        
        for (int i = 0; i < quantidade; i++){ 
            Veiculo v = new Veiculo(); 
            mapaVeiculos.put(v.getChassi(), v);
        
           
        }
      
        long fim10 = System.nanoTime();
        long duracao10 = (fim10 - inicio10);
       
       
        //2)------------Apresentação dos veículos gerados------------------------------------------------------------------------
        
        System.out.println("\n------------Todos os veículos gerados:");
        long começo2 = System.nanoTime();
        
        for (int i = 0; i < quantidade; i++) {
            Veiculo veiculo = mapaVeiculos.get(i);
            if (veiculo != null) {

                System.out.println(veiculo);
             
            }
        }

        long fim2 = System.nanoTime();
        long duração2 = (fim2 - começo2);
        
        
      
       //4)------------Método para remover os veículos com número de chassi igual ou inferior à 202050000------------------------------------
       
       
        System.out.println("\n------------Lista após a remoção dos veículos de chassi igual ou inferior à 202050000:"); 
        long começo4 = System.nanoTime();
        for (int i = 0; i < quantidade; i++) {
            Veiculo veiculo = mapaVeiculos.get(i);
            if (veiculo != null && veiculo.getChassi() <= 202050000) {
                mapaVeiculos.remove(veiculo.getChassi());
                

            }
        }
        //Lista com veiculos removidos
        for (int i = 0; i < quantidade; i++) {
            Veiculo veiculo = mapaVeiculos.get(i);
            if (veiculo != null) {
                System.out.println(veiculo);
            }
        }
        long fim4 = System.nanoTime();
        long duração4 = (fim4 - começo4);
   
   
        System.out.println("\nTempo para inserir "+quantidade+" veículos: " + duracao10 + " nanossegundos");
        System.out.println("\nTempo para apresentar os veículos gerados: " + duração2 + " nanossegundos");
    
        //3)------------Método para verificar quantos veículos da marca Ford existem no mapa------------------------------------
      
       
        long começo3 = System.nanoTime();
        int carrosFord = 0;
             for (int i = 0; i < quantidade; i++) {
                 Veiculo veiculo = mapaVeiculos.get(i);
                     if (veiculo != null && veiculo.getMarca().equals("Ford")) {
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
    


