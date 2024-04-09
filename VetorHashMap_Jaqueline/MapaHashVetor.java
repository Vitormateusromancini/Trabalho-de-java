


public class MapaHashVetor <Integer, Veiculo> {

    
    private Veiculo[] vetor;
    
    public MapaHashVetor() {
    this.vetor = (Veiculo[]) new Object[10];
    }
 

    private int hash(int chassi) {
     return chassi % this.vetor.length;
     }
 
    public Veiculo get(int chassi) {
      int hash = hash(chassi);
       return this.vetor[hash];
     }

    public void put(int chassi, Veiculo marca) {
         int hash = hash(chassi);
         this.vetor[hash] = marca;
     }

    public Veiculo remove(int chassi) {
        int hash = hash(chassi);
        Veiculo veiculo = this.vetor[hash];
            this.vetor[hash] = null;
        return veiculo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Veiculo veiculo : vetor) {
            if (veiculo != null) {
                sb.append(veiculo).append("\n");
            }
        }
        return sb.toString();
    }
    
}
