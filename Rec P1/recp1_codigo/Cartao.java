public class Cartao extends Pagamento {
    private String numeroCartao;

    public Cartao() {
        super();
    }

    public Cartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("Pagamento de R$ %.2f aprovado no cartao final %s%n",
                getValor(), numeroCartao.substring(numeroCartao.length() - 4));
        setStatus("APROVADO");
    }

    public String getNumeroCartao() { return numeroCartao; }
    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; }
}
