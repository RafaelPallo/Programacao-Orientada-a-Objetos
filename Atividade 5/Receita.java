public class Receita extends Procedimento {

    public Receita(String data, String descritivo) {
        super(data, descritivo);
    }

    public void preescrever() {
        System.out.println("Receita prescrita: " + getDescritivo());
    }
}
