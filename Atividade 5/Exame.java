public class Exame extends Procedimento {

    public Exame(String data, String descritivo) {
        super(data, descritivo);
    }

    public void solicitar() {
        System.out.println("Exame solicitado: " + getDescritivo());
    }
}
