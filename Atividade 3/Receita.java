public class Receita {
    private Consulta consulta;
    private String data;
    private String descritivo;
   
    public Receita(){}
    
    public Receita(Consulta consulta, String data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public void mostrar() {
        System.out.println( "Receita [consulta=" + consulta + ", data=" + data + ", descritivo=" + descritivo + "]");
    }

    public void preescrever(){}//todo
    public void consultar(){}//todo
    
}
