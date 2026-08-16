public class agenda {
    private String data;
    private String hora;
    private String medico;
    private String paciente;
      
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }
     public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    public void consultar(){
    //to do
    }
    public void mostrar(){
        System.out.println("\n--------------------");
        System.out.println("| Objeto da agenda |");
        System.out.println("--------------------");
        System.out.println("data:" + this.data);
        System.out.println("hora:" + this.hora);
        System.out.println("medico:" + this.medico);
        System.out.println("paciente:" + this.paciente);
    }
}