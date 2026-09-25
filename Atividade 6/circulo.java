public class Circulo extends Forma {

    public Circulo(float raio) {
        this.arestas.add(raio);
    }

    @Override
    public float calculaArea() {
        float raio = this.arestas.get(0);
        return (float) (Math.PI * raio * raio);
    }
}