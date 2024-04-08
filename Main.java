import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Quantidades de veículos a serem testados
        int[] quantidades = {10, 100, 1000, 100000, 1000000};

        // Loop sobre as quantidades de veículos
        for (int quantidade : quantidades) {
            // Criar conjunto de veículos
            List<Veiculo> veiculos = new ArrayList<>();
            for (int i = 0; i < quantidade; i++) {
                veiculos.add(new Veiculo());
            }

            // Medir o tempo para inserir veículos
            long inicio = System.nanoTime();
            // Código para inserir veículos
            long fim = System.nanoTime();
            long tempoInserir = fim - inicio;

            // Medir o tempo para apresentar todos os veículos
            inicio = System.nanoTime();
            // Código para apresentar todos os veículos
            fim = System.nanoTime();
            long tempoApresentar = fim - inicio;

            // Medir o tempo para verificar a quantidade de veículos da marca Ford
            inicio = System.nanoTime();
            // Código para verificar a quantidade de veículos da marca Ford
            fim = System.nanoTime();
            long tempoVerificarFord = fim - inicio;

            // Medir o tempo para remover veículos com número de chassi inferior a 202050000
            inicio = System.nanoTime();
            // Código para remover veículos com número de chassi inferior a 202050000
            fim = System.nanoTime();
            long tempoRemover = fim - inicio;

            // Imprimir os tempos gastos para cada operação
            System.out.println("Quantidade de veículos: " + quantidade);
            System.out.println("Tempo para inserir veículos: " + tempoInserir + " nanossegundos");
            System.out.println("Tempo para apresentar todos os veículos: " + tempoApresentar + " nanossegundos");
            System.out.println("Tempo para verificar veículos da marca Ford: " + tempoVerificarFord + " nanossegundos");
            System.out.println("Tempo para remover veículos com número de chassi inferior a 202050000: " + tempoRemover + " nanossegundos");
            System.out.println("-----------------------------------------");
        }
    }
}
