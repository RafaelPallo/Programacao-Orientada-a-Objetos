import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int codCliente;
    private String nome;
    private String telefone;
    private String email;

    private List<Endereco> enderecos = new ArrayList<>();

    private List<Pedido> historico = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int codCliente, String nome, String telefone, String email) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void cadastrar() {
        System.out.println("Cliente cadastrado: " + nome + " (cod " + codCliente + ")");
    }

    public List<Pedido> consultarHistorico() {
        return historico;
    }

    public Endereco adicionarEndereco(String rua, String numero, String bairro, String cidade, String cep) {
        Endereco endereco = new Endereco(rua, numero, bairro, cidade, cep);
        enderecos.add(endereco);
        return endereco;
    }

    public void adicionarPedido(Pedido pedido) {
        historico.add(pedido);
    }

    public int getCodCliente() { return codCliente; }
    public void setCodCliente(int codCliente) { this.codCliente = codCliente; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Endereco> getEnderecos() { return enderecos; }
    public void setEnderecos(List<Endereco> enderecos) { this.enderecos = enderecos; }

    public List<Pedido> getHistorico() { return historico; }
    public void setHistorico(List<Pedido> historico) { this.historico = historico; }

    @Override
    public String toString() {
        return nome + " (" + telefone + ")";
    }
}
