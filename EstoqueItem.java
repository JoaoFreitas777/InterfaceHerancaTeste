public interface EstoqueItem {
    void adicionar(int quantidade);
    void remover(int quantidade);
    int getQuantidadeDisponivel();
}