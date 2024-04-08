public interface Mapa {
    void inserir(Veiculo veiculo);
    Veiculo buscar(int chassi);
    void remover(int chassi);
    int tamanho();
}