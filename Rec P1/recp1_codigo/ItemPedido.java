public class ItemPedido {
    private int quantidade;
    private String observacao;

    private Pizza pizza;

    public ItemPedido() {
    }

    public ItemPedido(Pizza pizza, int quantidade, String observacao) {
        this.pizza = pizza;
        this.quantidade = quantidade;
        this.observacao = observacao;
    }

    public double calcularSubtotal() {
        return pizza.calcularPreco() * quantidade;
    }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public Pizza getPizza() { return pizza; }
    public void setPizza(Pizza pizza) { this.pizza = pizza; }
}
