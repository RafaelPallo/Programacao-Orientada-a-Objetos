public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    
    public Consulta(){}
    public Consulta(String data, String hora, Medico medico, Paciente paciente, String motivo, String historico) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.historico = historico;
    }

    public void mostrar() {
        System.out.println("Consulta [data=" + data + ", hora=" + hora );
        System.out.println("\n medico=" + medico + ", paciente=" + paciente);
        System.out.println("\n\n motivo=" + motivo + ", historico=" + historico );
    }

    public void cancelar(){}//todo
    public void marcar(){}//todo
    public void consultar(){}//todo
    public void realizar(){}//todo
    public void atualizar(){}//todo
}
