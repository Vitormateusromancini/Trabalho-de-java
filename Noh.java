public class Noh {
    private Veiculo veiculo;
    private Noh ant;
    private Noh prox;

    public Noh(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.ant = null;
        this.prox = null;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Noh getAnt() {
        return ant;
    }

    public void setAnt(Noh ant) {
        this.ant = ant;
    }

    public Noh getProx() {
        return prox;
    }

    public void setProx(Noh prox) {
        this.prox = prox;
    }
}
