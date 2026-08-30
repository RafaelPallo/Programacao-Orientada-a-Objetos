public class Agenda {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda() {}
    
    public Agenda(String data, String hora, Medico medico, Paciente paciente) throws Exception {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) throws Exception {
        if (data == null || data.trim().isEmpty()) {
            throw new Exception("Data é obrigatória!");
        }
        // Validação básica de formato de data (dd/MM/yyyy)
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new Exception("Data inválida! Use o formato dd/MM/yyyy");
        }
        this.data = data;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) throws Exception {
        if (hora == null || hora.trim().isEmpty()) {
            throw new Exception("Hora é obrigatória!");
        }
        // Validação básica de formato de hora (HH:mm)
        if (!hora.matches("\\d{2}:\\d{2}")) {
            throw new Exception("Hora inválida! Use o formato HH:mm");
        }
        this.hora = hora;
    }
    
    public Medico getMedico() {
        return medico;
    }
    
    public void setMedico(Medico medico) throws Exception {
        if (medico == null) {
            throw new Exception("Médico é obrigatório!");
        }
        this.medico = medico;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) throws Exception {
        if (paciente == null) {
            throw new Exception("Paciente é obrigatório!");
        }
        this.paciente = paciente;
    }
   
    public void mostrar() {
        System.out.println("Agenda [data=" + data + ", hora=" + hora + 
                          ", medico=" + (medico != null ? medico.getNome() : "Nenhum") + 
                          ", paciente=" + (paciente != null ? paciente.getNome() : "Nenhum") + "]");
    }
    
    public void consultar(){
        System.out.println("=== Consulta Agendada ===");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        if (medico != null) {
            System.out.println("Médico: " + medico.getNome() + " (" + medico.getEspecialidade() + ")");
        }
        if (paciente != null) {
            System.out.println("Paciente: " + paciente.getNome());
        }
    }
    
    // Método para validar se o agendamento é válido
    public boolean isValida() {
        return data != null && hora != null && medico != null && paciente != null;
    }
}
