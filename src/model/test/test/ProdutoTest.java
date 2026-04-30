public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Café", 5.0);

        if (produto.getNome().equals("Café") && produto.getPreco() == 5.0) {
            System.out.println("Teste Produto: OK");
        } else {
            System.out.println("Teste Produto: FALHOU");
        }
    }
}