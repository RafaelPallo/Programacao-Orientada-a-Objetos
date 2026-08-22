public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;
    
    public Recepcionista(){}
    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }
}

    public void acessar(){
        //TODO
    }
   
    public void mostrar() {
        System.out.println("Recepcionista [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", senha=" + senha + "]");
    }

    
