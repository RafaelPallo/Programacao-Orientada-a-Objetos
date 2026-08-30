public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista(){}
    
    public Recepcionista(String nome,  String cpf,  String telefone,  String senha) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }

    public void acessar(){
        //TODO
    }
   
    public void mostrar() {
        System.out.println("Recepcionista [nome=" + nome + ",  cpf=" + cpf + ",  telefone=" + telefone + "]");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception {
        if (nome == null || nome.isBlank()) {
            throw new Exception("Nome do recepcionista é obrigatório!");
        }
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws Exception {
        if (cpf == null || cpf.isBlank()) {
            throw new Exception("CPF do recepcionista é obrigatório!");
        }
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return "************";
    }
    public void setSenha(String senha) throws Exception {
        if (senha == null || senha.isBlank()) {
            throw new Exception("Senha do recepcionista é obrigatória!");
        }
        this.senha = senha;
    }
}
