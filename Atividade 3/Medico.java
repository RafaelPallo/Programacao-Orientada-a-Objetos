public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especilidade;
    private String senha;

    public Medica(){}
    public Medico(String nome, String crm, String telefone, String especilidade, String senha) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especilidade = especilidade;
        this.senha = senha;
    }

    public void mostrar() {
        System.out.println("Medico [nome=" + nome + ", crm=" + crm + ", telefone=" + telefone + ", especilidade=" + especilidade
                + ", senha=" + senha + "]");
    }

    public void acessar(){
        //TODO
    }

}
