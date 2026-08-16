public class paciente {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    private int idade;
    private String genero; 

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void cadastrar(){
    //to do
    }
    public void consultar(){
    //to do
    }
    public void mostar(){
        System.out.println("----------------------");
        System.out.println("| Objeto do paciente:|");
        System.out.println("----------------------");
        System.out.println("nome:" + this.nome);
        System.out.println("email:" + this.email);
        System.out.println("telefone:" + this.telefone);
        System.out.println("idade:" + this.idade);
        System.out.println("genero:" + this.genero);
    }
}