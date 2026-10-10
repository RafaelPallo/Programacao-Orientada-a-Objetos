public class CarteiraDigital extends Pagamento {
    private String carteira;

    public CarteiraDigital() {
        super();
    }

    public CarteiraDigital(double valor, String carteira) {
        super(valor);
        this.carteira = carteira;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("Pagamento de R$ %.2f aprovado na carteira digital %s%n", getValor(), carteira);
        setStatus("APROVADO");
    }

    public String getCarteira() { return carteira; }
    public void setCarteira(String carteira) { this.carteira = carteira; }
}
