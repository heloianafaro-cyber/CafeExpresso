public class ItemPedidoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Café", 5.0);
        ItemPedido item = new ItemPedido(produto, 2);

        double resultado = item.calcularSubtotal();

        if (resultado == 10.0) {
            System.out.println("Teste ItemPedido: OK");
        } else {
            System.out.println("Teste ItemPedido: FALHOU");
        }
    }
}