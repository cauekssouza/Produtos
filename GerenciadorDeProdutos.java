import java.util.ArrayList;
import java.util.Iterator;

public class GerenciadorDeProdutos {
    private final ArrayList<Produto> produtos;

    // Construtor
    public GerenciadorDeProdutos() {
        produtos = new ArrayList<>();
    }

    // Métodos
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public String removerProduto(int id) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getId() == id) {
                iterator.remove();
                return "Produto removido com sucesso.";
            }
        }
        return "Produto não encontrado.";
    }

    // Listar os Produtos
    public void imprimirProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto); // Assuming Produto class has overridden toString() method
        }
    }
}