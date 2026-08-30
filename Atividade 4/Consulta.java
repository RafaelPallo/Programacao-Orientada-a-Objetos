public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta(){}

    public Consulta(String data, String hora, Medico medico, Paciente paciente, String motivo, String historico) throws Exception {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) throws Exception {
        if (data == null || data.isBlank()) {
            throw new Exception("Data da consulta é obrigatória!");
        }
        this.data = data;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) throws Exception {
        if (hora == null || hora.isBlank()) {
            throw new Exception("Hora da consulta é obrigatória!");
        }
        this.hora = hora;
    }
    
    public Medico getMedico() {
        return medico;
    }
    
    public void setMedico(Medico medico) throws Exception {
        if (medico == null) {
            throw new Exception("Médico é obrigatório para a consulta!");
        }
        this.medico = medico;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) throws Exception {
        if (paciente == null) {
            throw new Exception("Paciente é obrigatório para a consulta!");
        }
        this.paciente = paciente;
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) throws Exception {
        if (motivo == null || motivo.isBlank()) {
            throw new Exception("Motivo da consulta é obrigatório!");
        }
        this.motivo = motivo;
    }
    
    public String getHistorico() {
        return historico;
    }
    
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    public void mostrar() {
        System.out.println("Consulta [data=" + data + ", hora=" + hora);
        System.out.println("\n medico=" + (medico != null ? medico.getNome() : "Nenhum") + 
                          ", paciente=" + (paciente != null ? paciente.getNome() : "Nenhum"));
        System.out.println("\n\n motivo=" + motivo + ", historico=" + historico + "]");
    }

    public void cancelar() {
        System.out.println("Consulta cancelada para o paciente: " + 
                          (paciente != null ? paciente.getNome() : "Nenhum"));
    }
    
    public void marcar() {
        System.out.println("Consulta marcada para " + data + " às " + hora);
        System.out.println("Médico: " + (medico != null ? medico.getNome() : "Nenhum"));
        System.out.println("Paciente: " + (paciente != null ? paciente.getNome() : "Nenhum"));
    }
    
    public void consultar() {
        System.out.println("=== Detalhes da Consulta ===");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        if (medico != null) {
            System.out.println("Médico: " + medico.getNome() + " (" + medico.getEspecialidade() + ")");
        }
        if (paciente != null) {
            System.out.println("Paciente: " + paciente.getNome());
        }
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + (historico != null ? historico : "Sem histórico"));
    }
    
    public void realizar() {
        System.out.println("Consulta realizada com sucesso!");
        System.out.println("Paciente: " + (paciente != null ? paciente.getNome() : "Nenhum"));
        System.out.println("Médico: " + (medico != null ? medico.getNome() : "Nenhum"));
    }
    
    public void atualizar() {
        System.out.println("Consulta atualizada com sucesso!");
    }
}
