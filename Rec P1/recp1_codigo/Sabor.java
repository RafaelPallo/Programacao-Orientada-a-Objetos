public class Sabor {
    private String nome;
    private double preco;
    private boolean disponivel;

    public Sabor() {
    }

    public Sabor(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.disponivel = true;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    @Override
    public String toString() { return nome; }
}
