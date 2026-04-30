public class PedidoTest {
    public static void main(String[] args) {
        Produto cafe = new Produto("Café", 5.0);
        Produto bolo = new Produto("Bolo", 8.0);

        ItemPedido item1 = new ItemPedido(cafe, 2); // 10
        ItemPedido item2 = new ItemPedido(bolo, 1); // 8

        Pedido pedido = new Pedido();
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        double total = pedido.calcularTotal();

        if (total == 18.0) {
            System.out.println("Teste Pedido: OK");
        } else {
            System.out.println("Teste Pedido: FALHOU");
        }
    }
}