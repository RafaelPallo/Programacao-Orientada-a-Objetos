public class Quadrado extends Forma {

    public Quadrado(float lado) {
        this.arestas.add(lado);
    }

    @Override
    public float calculaArea() {
        float lado = this.arestas.get(0);
        return lado * lado;
    }
}