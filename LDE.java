public class LDE implements Mapa {//TAD Lista duplamente encadeada
    private Noh inicio;
    private Noh fim;
    public LDE (){
    this.inicio = null;
    this.fim = null;
    }

    
    public void inserir(Veiculo veiculo) {
        Noh novo = new Noh(veiculo);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }

    @Override
    public Veiculo buscar(int chassi) {
        Noh atual = inicio;
        while (atual != null) {
            Veiculo veiculo = (Veiculo) atual.getVeiculo();
            if (veiculo.getChassi() == chassi) {
                return veiculo;
            }
            atual = atual.getProx();
        }
        return null;
    }
    

    public boolean estahVazia() { 
        return inicio == null;
    
    
     }
     @Override
     public void remover(int chassi) { 
         Noh atual = inicio;
         while (atual != null) {
             Veiculo veiculo = (Veiculo) atual.getVeiculo();
             if (veiculo.getChassi() == chassi) {
                 if (atual == inicio && atual == fim) {
                     inicio = null;
                     fim = null;
                 } else if (atual == inicio) {
                     inicio = inicio.getProx();
                     inicio.setAnt(null);
                 } else if (atual == fim) {
                     fim = fim.getAnt();
                     fim.setProx(null);
                 } else {
                     atual.getAnt().setProx(atual.getProx());
                     atual.getProx().setAnt(atual.getAnt());
                 }
                 return;
             }
             atual = atual.getProx();
         }
     }

     public int tamanho() { 
        int tamanho = 0;
        Noh atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.getProx();
        }
        return tamanho;
    }
    
     public int numVeiculos() {
        int numVeiculos = 0;
        Noh atual = inicio;
        while (atual != null) {
            numVeiculos++;
            atual = atual.getProx();
        }
        return numVeiculos;
    }
    

}
    