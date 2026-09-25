import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(3.0f));
        formas.add(new Quadrado(4.0f));
        formas.add(new Triangulo(3.0f, 4.0f, 5.0f));

        for (Forma forma : formas) {
            System.out.println("Área (" + forma.getClass().getSimpleName() + "): " + forma.calculaArea());
        }
    }
}