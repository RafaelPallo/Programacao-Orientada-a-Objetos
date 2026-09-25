public class Triangulo extends Forma {

    public Triangulo(float lado1, float lado2, float lado3) {
        this.arestas.add(lado1);
        this.arestas.add(lado2);
        this.arestas.add(lado3);
    }

    @Override
    public float calculaArea() {
        float a = this.arestas.get(0);
        float b = this.arestas.get(1);
        float c = this.arestas.get(2);
        
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}