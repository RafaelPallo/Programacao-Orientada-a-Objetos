import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String tamanho; // PEQUENA, MEDIA, GRANDE ou FAMILIA


    private List<Sabor> sabores = new ArrayList<>();
    private Borda borda;
    private List<Adicional> adicionais = new ArrayList<>();

    public Pizza() {
    }

    public Pizza(String tamanho) {
        this.tamanho = tamanho;
    }

    // Aceita ate 2 sabores (meio a meio)
    public void adicionarSabor(Sabor sabor) {
        if (sabores.size() >= 2) {
            throw new IllegalStateException("A pizza aceita no maximo 2 sabores.");
        }
        sabores.add(sabor);
    }

    public void adicionarAdicional(Adicional adicional) {
        adicionais.add(adicional);
    }

    private double fatorTamanho() {
        switch (tamanho.toUpperCase()) {
            case "PEQUENA": return 0.8;
            case "GRANDE": return 1.3;
            case "FAMILIA": return 1.6;
            default: return 1.0; // MEDIA
        }
    }

    // Meio a meio: vale o sabor mais caro, vezes o fator do tamanho,
    // mais o valor da borda e dos adicionais.
    public double calcularPreco() {
        double base = 0;
        for (Sabor s : sabores) {
            base = Math.max(base, s.getPreco());
        }
        double total = base * fatorTamanho();
        if (borda != null) {
            total += borda.getPreco();
        }
        for (Adicional a : adicionais) {
            total += a.getPreco();
        }
        return total;
    }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public List<Sabor> getSabores() { return sabores; }
    public void setSabores(List<Sabor> sabores) { this.sabores = sabores; }

    public Borda getBorda() { return borda; }
    public void setBorda(Borda borda) { this.borda = borda; }

    public List<Adicional> getAdicionais() { return adicionais; }
    public void setAdicionais(List<Adicional> adicionais) { this.adicionais = adicionais; }

    @Override
    public String toString() {
        String descricao = "Pizza " + tamanho + " " + sabores;
        if (borda != null) {
            descricao += " + borda " + borda;
        }
        if (!adicionais.isEmpty()) {
            descricao += " + " + adicionais;
        }
        return descricao;
    }
}
