import java.util.ArrayList;
import java.util.List;

// HERANCA: Consulta extends Agenda (toda consulta tem data/hora)
public class Consulta extends Agenda {
    private String motivo;
    private String historico;

    // ASSOCIACAO: a consulta conhece o paciente e o medico envolvidos,
    // mas nenhum dos dois deixa de existir se a consulta for cancelada
    private Paciente paciente;
    private Medico medico;

    // COMPOSICAO: Receita e Exame só existem enquanto parte desta Consulta;
    // sao criados aqui dentro (metodos adicionarReceita/adicionarExame) e
    // nao tem sentido/vida fora da consulta que os originou
    private List<Receita> receitas = new ArrayList<>();
    private List<Exame> exames = new ArrayList<>();

    public Consulta(String data, String hora, String motivo, Paciente paciente, Medico medico) {
        super(data, hora);
        this.motivo = motivo;
        this.paciente = paciente;
        this.medico = medico;
        paciente.adicionarConsulta(this);
    }

    public void marcar() {
        System.out.println("Consulta marcada: " + motivo + " (" + getData() + " " + getHora() + ")");
    }

    public void cancelar() {
        System.out.println("Consulta de " + paciente.getNome() + " cancelada.");
    }

    @Override
    public void consultar() {
        super.consultar();
        System.out.println("Consulta [motivo=" + motivo + ", historico=" + historico
                + ", paciente=" + paciente.getNome() + ", medico=" + medico.getNome() + "]");
    }

    public void realizar() {
        System.out.println("Consulta com " + paciente.getNome() + " realizada por " + medico.getNome() + ".");
    }

    public void atualizar() {
        historico = (historico == null ? "" : historico + "; ") + "atualizado em " + getData();
    }

    // COMPOSICAO: a Receita nasce e e gerenciada aqui dentro
    public Receita adicionarReceita(String data, String descritivo) {
        var receita = new Receita(data, descritivo);
        receitas.add(receita);
        return receita;
    }

    // COMPOSICAO: o Exame nasce e e gerenciado aqui dentro
    public Exame adicionarExame(String data, String descritivo) {
        var exame = new Exame(data, descritivo);
        exames.add(exame);
        return exame;
    }

    public List<Receita> getReceitas() { return receitas; }
    public List<Exame> getExames() { return exames; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public String getHistorico() { return historico; }
    public void setHistorico(String historico) { this.historico = historico; }
    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
}
