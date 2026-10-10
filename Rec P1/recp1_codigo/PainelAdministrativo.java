import java.util.ArrayList;
import java.util.List;

public class PainelAdministrativo {
   
    private List<Pedido> pedidos = new ArrayList<>();

    public PainelAdministrativo() {
    }

    public void receberPedido(Pedido pedido) {
        pedidos.add(pedido);
        notificarNovoPedido(pedido);
    }

    public void alterarStatus(Pedido pedido, String novoStatus) {
        pedido.atualizarStatus(novoStatus);
        System.out.println("[Painel] Pedido #" + pedido.getNumero() + " agora esta: " + novoStatus);
    }

    public void notificarNovoPedido(Pedido pedido) {
        System.out.println("[Painel] NOVO PEDIDO #" + pedido.getNumero()
                + " de " + pedido.getCliente().getNome());
    }

    public List<Pedido> getPedidos() { return pedidos; }
    public void setPedidos(List<Pedido> pedidos) { this.pedidos = pedidos; }
}
