import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    // AGREGACAO: o paciente guarda referencia ao seu historico de consultas,
    // mas nao e ele quem cria/destroi as consultas (quem faz isso e a Recepcionista)
    private List<Consulta> consultas = new ArrayList<>();

    public void cadastrar() {
        System.out.println("Paciente " + nome + " cadastrado no sistema.");
    }

    public void consultar() {
        System.out.println("Paciente [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone
                + ", genero=" + genero + ", idade=" + idade + "]");
    }

    // usado pela Consulta para se registrar no paciente (agregacao)
    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}
