public class Exame {
    private Consulta consulta;
    private String data;
    private String descritivo;
 
    public Exame(){}
    
    public Exame(Consulta consulta, String data, String descritivo) throws Exception {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }
    
    public Consulta getConsulta() {
        return consulta;
    }
    
    public void setConsulta(Consulta consulta) throws Exception {
        if (consulta == null) {
            throw new Exception("Consulta é obrigatória para o exame!");
        }
        this.consulta = consulta;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) throws Exception {
        if (data == null || data.isBlank()) {
            throw new Exception("Data do exame é obrigatória!");
        }
        this.data = data;
    }
    
    public String getDescritivo() {
        return descritivo;
    }
    
    public void setDescritivo(String descritivo) throws Exception {
        if (descritivo == null || descritivo.isBlank()) {
            throw new Exception("Descritivo do exame é obrigatório!");
        }
        this.descritivo = descritivo;
    }
    
    public void mostrar() {
        System.out.println("Exame [consulta=" + (consulta != null ? consulta.toString() : "Nenhuma") + 
                          ", data=" + data + ", descritivo=" + descritivo + "]");
    }

    public void prescrever(){}//todo
    
    public void consultar(){}//todo
}
