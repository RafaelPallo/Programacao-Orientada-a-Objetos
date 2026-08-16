public class recepcionista {
    private String cpf;
    private String nome;
    private String telefone;
    private String senha;
      
    public String getSenha() {
        return "*********";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public void acessar(){
    //to do
    }
    public void mostrar(){
        System.out.println("\n---------------------------");
        System.out.println("| Objeto do recepcionista |");
        System.out.println("---------------------------");
        System.out.println("nome:" + this.nome);
        System.out.println("cpf:" + this.cpf);
        System.out.println("telefone:" + this.telefone);
    }
}