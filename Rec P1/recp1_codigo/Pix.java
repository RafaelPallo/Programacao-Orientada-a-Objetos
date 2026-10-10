public class Pix extends Pagamento {
    private String chavePix;

    public Pix() {
        super();
    }

    public Pix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("Pagamento de R$ %.2f confirmado via Pix (chave %s)%n", getValor(), chavePix);
        setStatus("APROVADO");
    }

    public String getChavePix() { return chavePix; }
    public void setChavePix(String chavePix) { this.chavePix = chavePix; }
}
