public class Produto implements EstoqueItem {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void remover(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    @Override
    public int getQuantidadeDisponivel() {
        return quantidade;
    }
}