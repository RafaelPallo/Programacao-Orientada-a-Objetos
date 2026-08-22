public class Paciente {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    private int idade;
    private char genero;
    private String senha;
 
    public Paciente(){}
    public Paciente(int codigo, String nome, String telefone, String email, int idade, char genero, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
        this.senha = senha;
    }
    public void cadastrar(){
        //todo
    }
    public void consultar(){
        //todo
    }
    public void mostrar(){
        System.out.println("Objeto do tipo Paciente");
        System.out.println("nome:"+ this.nome);
        System.out.println("email:"+ this.email);
        System.out.println("telefone:"+ this.telefone);
        System.out.println("idade:"+ this.idade);
    }
    
    public String getSenha() {
        return "************";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
