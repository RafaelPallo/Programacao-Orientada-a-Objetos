public class App {
    public static void main(String[] args) throws Exception {
        var recepcionista = new Recepcionista();
        recepcionista.setNome("maria da silva");
        recepcionista.setTelefone("2344-2344");
        recepcionista.setSenha("123456");
        recepcionista.setCpf("111.222.333-44");
        recepcionista.acessar();

        var paciente = new Paciente();
        paciente.setNome("joao pereira");
        paciente.setCpf("222.333.444-55");
        paciente.setTelefone("9988-7766");
        paciente.setGenero("Masculino");
        paciente.setIdade(35);

        recepcionista.cadastrar(paciente);

        var medico = new Medico();
        medico.setNome("ana souza");
        medico.setTelefone("3344-5566");
        medico.setSenha("abcdef");
        medico.setCrm("CRM-12345");
        medico.setEspecialidade("Clinico Geral");
        medico.acessar();

        var consulta = recepcionista.marcar(paciente, medico, "20/09/2026", "14:00", "dor de cabeca recorrente");

        medico.realizar(consulta);
        medico.prescrever(consulta, "20/09/2026", "Paracetamol 750mg, 1 comprimido a cada 8 horas");
        medico.solicitar(consulta, "20/09/2026", "Hemograma completo");

        consulta.atualizar();
        consulta.consultar();

        System.out.println(">>>>>>>>>>>>>RECEITAS<<<<<<<<<<<");
        for (var r : consulta.getReceitas()) {
            r.consultar();
            r.preescrever();
        }

        System.out.println(">>>>>>>>>>>>>EXAMES<<<<<<<<<<<");
        for (var e : consulta.getExames()) {
            e.consultar();
            e.solicitar();
        }

        System.out.println(">>>>>>>>>>>>>HISTORICO DO PACIENTE<<<<<<<<<<<");
        for (var c : paciente.getConsultas()) {
            c.consultar();
        }
    }
}
