// Classe base (HERANCA): Cartao, Pix e CarteiraDigital estendem Pagamento
public abstract class Pagamento {
    private double valor;
    private String status; // PENDENTE ou APROVADO

    public Pagamento() {
    }

    public Pagamento(double valor) {
        this.valor = valor;
        this.status = "PENDENTE";
    }

    public abstract void processarPagamento();

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
