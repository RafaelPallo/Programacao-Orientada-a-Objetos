import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDateTime dataHora;
    private String status; 
    private String formaEntrega;
    private String observacoes;

   
    private Cliente cliente;
    private Endereco enderecoEntrega;
    private Pagamento pagamento;

    // 
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(int numero, Cliente cliente, Endereco enderecoEntrega, String formaEntrega) {
        this.numero = numero;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.formaEntrega = formaEntrega;
        this.dataHora = LocalDateTime.now();
        this.status = "RECEBIDO";
        cliente.adicionarPedido(this); 
    }

    
    public ItemPedido adicionarItem(Pizza pizza, int quantidade, String observacao) {
        ItemPedido item = new ItemPedido(pizza, quantidade, observacao);
        itens.add(item);
        return item;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getFormaEntrega() { return formaEntrega; }
    public void setFormaEntrega(String formaEntrega) { this.formaEntrega = formaEntrega; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Endereco getEnderecoEntrega() { return enderecoEntrega; }
    public void setEnderecoEntrega(Endereco enderecoEntrega) { this.enderecoEntrega = enderecoEntrega; }

    public Pagamento getPagamento() { return pagamento; }
    public void setPagamento(Pagamento pagamento) { this.pagamento = pagamento; }

    public List<ItemPedido> getItens() { return itens; }
    public void setItens(List<ItemPedido> itens) { this.itens = itens; }
}
