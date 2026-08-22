public class App {
   
public static void main(String[] args) {
    var maria = new Paciente();
    var joao = new Paciente();

    maria.setCodigo(1);
    maria.setEmail("maria@norton.net.br");
    maria.setIdade(30);
    maria.setTelefone("3244-2344");
    maria.setNome("maria da silva");
    maria.setSenha("123123");
    maria.mostrar();

    System.out.println("senha da maria:"+ maria.getSenha());

    var m1 = new Medico();
    m1.setCrm("3245234234");
    m1.setEspecilidade("pediatra");
    m1.setNome("joao da silva");
    m1.setTelefone("2344-2344");
    m1.mostrar();

    var rec1 = new Recepcionista();
    rec1.setCpf("4325345435");
    rec1.setNome("joana");
    rec1.setTelefone("3455-2344");
    rec1.mostrar();

    var agenda1 = new Agenda();
    agenda1.setData("25/08/2026");
    agenda1.setHora("10:00");
    agenda1.setMedico(m1);
    agenda1.setPaciente(joao);
    agenda1.mostrar();

    var consultaA = new Consulta();
    consultaA.setData("21/08/2026");
    consultaA.setHora("15:00");
    consultaA.setMedico(m1);
    consultaA.setPaciente(maria);
    consultaA.setMotivo("dor de barriga");
    consultaA.setHistorico("pare de comer besteira");
    consultaA.mostrar();

    var receita123 = new Receita();
    receita123.setConsulta(consultaA);
    receita123.setData("21/08/2026");
    receita123.setDescritivo("buscopan + luftal");
    receita123.mostrar();
}
}
