import java.util.ArrayList;
import java.util.List;

public abstract class Forma {
    protected List<Float> arestas = new ArrayList<>();

    public List<Float> getArestas() {
        return this.arestas;
    }

    public void setArestas(List<Float> a) {
        this.arestas = a;
    }

    public abstract float calculaArea();
}