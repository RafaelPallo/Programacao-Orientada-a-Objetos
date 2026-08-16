public class receita {
    private String data;
    private String consulta;
    private String descritivo;;  
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getConsulta() {
        return consulta;
    }
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
    
    public void prescrever(){
    //to do
    }
    public void consultar(){
    //to do
    }
    public void mostrar(){
        System.out.println("\n----------------------");
        System.out.println("| Objeto da receita |");
        System.out.println("----------------------");
        System.out.println("data:" + this.data);
        System.out.println("consulta:" + this.consulta);
        System.out.println("descritivo:" + this.descritivo);
    }    
}