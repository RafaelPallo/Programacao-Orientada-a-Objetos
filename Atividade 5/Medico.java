// HERANCA: Medico extends Funcionario
public class Medico extends Funcionario {
    private String crm;
    private String especialidade;

    public Medico (){}
    
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // ASSOCIACAO: o medico realiza a consulta
    public void realizar(Consulta consulta) {
        consulta.realizar();
        System.out.println("Dr(a). " + getNome() + " realizou a consulta.");
    }

    // ASSOCIACAO: o medico prescreve, mas quem CRIA a Receita e a Consulta
    // (COMPOSICAO: a receita nasce e vive dentro da consulta)
    public Receita prescrever(Consulta consulta, String data, String descritivo) {
        var receita = consulta.adicionarReceita(data, descritivo);
        System.out.println("Dr(a). " + getNome() + " prescreveu uma receita.");
        return receita;
    }

    // ASSOCIACAO: o medico solicita, mas quem CRIA o Exame e a Consulta
    // (COMPOSICAO: o exame nasce e vive dentro da consulta)
    public Exame solicitar(Consulta consulta, String data, String descritivo) {
        var exame = consulta.adicionarExame(data, descritivo);
        System.out.println("Dr(a). " + getNome() + " solicitou um exame.");
        return exame;
    }
}
