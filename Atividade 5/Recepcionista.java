import java.util.ArrayList;
import java.util.List;

// HERANCA: Recepcionista extends Funcionario
public class Recepcionista extends Funcionario {
    private String cpf;

    // ASSOCIACAO ("cadastra"): a recepcionista conhece os pacientes que
    // ela cadastrou, mas o Paciente existe de forma independente dela
    // (se a recepcionista "deixasse de existir", o paciente continuaria existindo)
    private List<Paciente> pacientesCadastrados = new ArrayList<>();

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // ASSOCIACAO "cadastra"
    public void cadastrar(Paciente paciente) {
        paciente.cadastrar();
        pacientesCadastrados.add(paciente);
        System.out.println(getNome() + " cadastrou o paciente " + paciente.getNome());
    }

    // ASSOCIACAO "marcar" -> cria e devolve uma Consulta
    public Consulta marcar(Paciente paciente, Medico medico, String data, String hora, String motivo) {
        var consulta = new Consulta(data, hora, motivo, paciente, medico);
        consulta.marcar();
        System.out.println(getNome() + " marcou uma consulta para " + paciente.getNome());
        return consulta;
    }

    public List<Paciente> getPacientesCadastrados() {
        return pacientesCadastrados;
    }
}
