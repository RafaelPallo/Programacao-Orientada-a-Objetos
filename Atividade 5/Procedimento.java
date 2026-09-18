public abstract class Procedimento {
    private String data;
    private String descritivo;

    public Procedimento(){}
    
    public Procedimento(String data, String descritivo) {
        this.data = data;
        this.descritivo = descritivo;
    }

    public void consultar() {
        System.out.println(getClass().getSimpleName() + " [data=" + data + ", descritivo=" + descritivo + "]");
    }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getDescritivo() { return descritivo; }
    public void setDescritivo(String descritivo) { this.descritivo = descritivo; }
}
