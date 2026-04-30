public class StatusPedidoTest {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        if (pedido.getStatus() == StatusPedido.ABERTO) {
            System.out.println("Status inicial: OK");
        } else {
            System.out.println("Status inicial: FALHOU");
        }

        pedido.setStatus(StatusPedido.FINALIZADO);

        if (pedido.getStatus() == StatusPedido.FINALIZADO) {
            System.out.println("Mudança de status: OK");
        } else {
            System.out.println("Mudança de status: FALHOU");
        }
    }
}