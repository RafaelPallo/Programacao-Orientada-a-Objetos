public class Agenda {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    
    public Agenda(){}
    public Agenda(String data, String hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void mostrar() {
        System.out.println("Agenda [data=" + data + ", hora=" + hora + ", medico=" + medico + ", paciente=" + paciente + "]");
    }
    
    public void consultar(){
        //TODO
    }

}
