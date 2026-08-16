public class Main {
    public static void main(String[] args) {
        var maria = new paciente();
        
        maria.setNome("Maria");
        maria.setCodigo(1);
        maria.setEmail("maria@luiza.net.br");
        maria.setIdade(30);
        maria.setTelefone("3455-4343");
        maria.setGenero("F");
        maria.mostar();

        var roberta = new medico();
        
        roberta.setNome("Roberta");
        roberta.setCrm(1254541225);
        roberta.setTelefone("96521-6595");
        roberta.setEspecialidade("Endocrinologista");
        roberta.mostrar();
        System.out.println("senha da Roberta:"+ roberta.getSenha());
        
        
        var armando = new recepcionista();
        
        armando.setNome("Armando");
        armando.setCpf("5215584447");
        armando.setTelefone("9522-74558");
        armando.mostrar();
        System.out.println("senha do Armando:"+ armando.getSenha());
        
        var agendamento = new agenda();
        
        agendamento.setData("19/09/2026");
        agendamento.setHora("13:30");
        agendamento.setMedico("Roberta");
        agendamento.setPaciente("Maria");
        agendamento.mostrar();
        
        var consulta32 = new consulta();
        
        consulta32.setData("19/09/2026");
        consulta32.setHora("13:30");
        consulta32.setMedico("Roberta");
        consulta32.setPaciente("Maria");
        consulta32.setMotivo("Dores");
        consulta32.setHistorico("Sem historico");
        
        consulta32.mostrar();
        
        var receita32 = new receita();
        
        receita32.setData("19/09/2026");
        receita32.setConsulta("32");
        receita32.setDescritivo("Tramal 6 em 6 horas");
        
        receita32.mostrar();
       
       var exame32 = new exame();
        
        exame32.setData("19/09/2026");
        exame32.setConsulta("32");
        exame32.setDescritivo("Hemograma Completo");
        
        exame32.mostrar(); 

    }
}
