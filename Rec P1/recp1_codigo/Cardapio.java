import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Pizza> pizzas = new ArrayList<>();

    public Cardapio() {
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void atualizarPreco(String nomeSabor, double novoPreco) {
        for (Pizza p : pizzas) {
            for (Sabor s : p.getSabores()) {
                if (s.getNome().equalsIgnoreCase(nomeSabor)) {
                    s.setPreco(novoPreco);
                }
            }
        }
    }

    public void atualizarDisponibilidade(String nomeSabor, boolean disponivel) {
        for (Pizza p : pizzas) {
            for (Sabor s : p.getSabores()) {
                if (s.getNome().equalsIgnoreCase(nomeSabor)) {
                    s.setDisponivel(disponivel);
                }
            }
        }
    }

    public List<Pizza> getPizzas() { return pizzas; }
    public void setPizzas(List<Pizza> pizzas) { this.pizzas = pizzas; }
}
