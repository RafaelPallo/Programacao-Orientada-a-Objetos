public class consulta {
    private String data;
    private String hora;
    private String medico;
    private String paciente;
    private String motivo;
    private String historico;  
    
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
     public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getHistorico() {
        return historico;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    public void marcar(){
    //to do
    }
    public void cancelar(){
    //to do
    }
    public void consultar(){
    //to do
    }
    public void atualizar(){
    //to do
    }
    public void realizar(){
    //to do
    }
    public void mostrar(){
        System.out.println("\n----------------------");
        System.out.println("| Objeto da consulta |");
        System.out.println("----------------------");
        System.out.println("data:" + this.data);
        System.out.println("hora:" + this.hora);
        System.out.println("medico:" + this.medico);
        System.out.println("paciente:" + this.paciente);
        System.out.println("motivo:" + this.motivo);
        System.out.println("historico:" + this.historico);
    }
}