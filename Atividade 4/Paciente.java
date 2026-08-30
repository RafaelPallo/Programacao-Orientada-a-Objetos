public class Paciente {
    private int codigo;
    private String nome;
    private String telefone;
    private char genero;
    private String senha;
    private int idade;
    private String email;
    
    public Paciente(){}

    public Paciente(int _codigo, String _nome, String _email, int _idade, char _genero) throws Exception {
        setCodigo(_codigo);
        setNome(_nome);
        setEmail(_email);
        setIdade(_idade);
        setGenero(_genero);    
    }
    
    public Paciente(int codigo, String nome, String telefone, String email, int idade, char genero, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setIdade(idade);
        setGenero(genero);
        setSenha(senha);
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) throws Exception {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
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
        if(idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        }
        this.idade = idade;
    }
    
    public char getGenero() {
        return genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public void cadastrar(){
        // TODO - implementar lógica de cadastro
        System.out.println("Paciente " + nome + " cadastrado com sucesso!");
    }
    
    public void consultar(){
        // TODO - implementar lógica de consulta
        System.out.println("Consultando dados do paciente: " + nome);
    }
    
    public void mostrar(){
        System.out.println("Objeto do tipo Paciente");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Idade: " + this.idade);
        System.out.println("Gênero: " + this.genero);
    }
    
    public String getSenha() {
        return "************";
    }
    
    // Método para verificar senha (mais seguro)
    public boolean verificarSenha(String senhaTentativa) {
        return this.senha != null && this.senha.equals(senhaTentativa);
    }
    
    public void setSenha(String senha) {
        this.senha = senha; // Em produção, deveria ser criptografada
    }
}
