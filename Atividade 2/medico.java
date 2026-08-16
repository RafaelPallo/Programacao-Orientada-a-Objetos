public class medico {
    private int crm;
    private String nome;
    private String telefone;
    private String especialidade;
    private String senha;
      
    public String getSenha() {
        return "*********";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void acessar(){
    //to do
    }
    public void mostrar(){
        System.out.println("\n--------------------");
        System.out.println("| Objeto do medico |");
        System.out.println("--------------------");
        System.out.println("nome:" + this.nome);
        System.out.println("crm:" + this.crm);
        System.out.println("telefone:" + this.telefone);
        System.out.println("especialidade:" + this.especialidade);
    }
}