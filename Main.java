public class Main {
    public static void main(String[] args) {
        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();

        // Adicionando alguns produtos para teste
        gerenciador.adicionarProduto(new Produto(1, "Camiseta", 29.99));
        gerenciador.adicionarProduto(new Produto(2, "Calça Jeans", 79.90));
        gerenciador.adicionarProduto(new Produto(3, "Tênis Esportivo", 129.99));

        // Removendo um produto pelo ID
        System.out.println(gerenciador.removerProduto(2)); // Deve imprimir: Produto removido com sucesso.
        System.out.println(gerenciador.removerProduto(4)); // Deve imprimir: Produto não encontrado.

        // Imprimindo todos os produtos
        gerenciador.imprimirProdutos();
    }
}

