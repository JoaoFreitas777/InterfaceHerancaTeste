public class TesteEstoque {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 50);

        produto.adicionar(20);
        System.out.println("Quantidade disponível após adição: " + produto.getQuantidadeDisponivel());

        produto.remover(10);
        System.out.println("Quantidade disponível após remoção: " + produto.getQuantidadeDisponivel());

        produto.remover(100);
    }
}