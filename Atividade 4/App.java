public class App {
   
    public static String concatenar(String a,  String b){
        String r ="";
        try
        {
            r = a.toLowerCase() + " "+ b.toLowerCase();
        }
        catch(Exception err){
            r = "frase vazia!!";
            //GRAVAR NO ARQUIVO DE LOG err.getMessage();
        }
        finally{
            return r.toUpperCase();
        }
    }

    public static void main(String[] args) {
        try {
            var maria = new Paciente();
            var joao = new Paciente();

            maria.setCodigo(1);
            maria.setEmail("maria@norton.net.br");
            maria.setIdade(30);
            maria.setTelefone("3244-2344");
            maria.setSenha("123123");
            maria.mostrar();

            var jose = new Paciente(1, "jose", "(11) 99999-9999", "j@j.com", 12, 'M', "senha123");
            jose.mostrar();

            System.out.println("senha da maria: "+ maria.getSenha());
            
            try {
                var m0 = new Medico("", "", "234234", "otorrino", "123123");
                m0.mostrar();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro "+ e.getMessage());
            }
           
            var m1 = new Medico();
            try {
                m1.setCrm("123456/SP");
                m1.setEspecialidade("pediatra");
                m1.setNome("Dr. Silva");
                m1.setTelefone("2344-2344");
                m1.mostrar();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro "+ e.getMessage());
            }

            var rec1 = new Recepcionista();
            try {
                rec1.setCpf("4325345435");
                rec1.setNome("joana");
                rec1.setTelefone("3455-2344");
                rec1.setSenha("senha123");
                rec1.mostrar();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro "+ e.getMessage());
            }

            var agenda1 = new Agenda();
            try {
                agenda1.setData("25/08/2026");
                agenda1.setHora("10:00");
                agenda1.setMedico(m1);
                agenda1.setPaciente(joao);
                agenda1.mostrar();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro "+ e.getMessage());
            }

            var consultaA = new Consulta();
            try {
                consultaA.setData("21/08/2026");
                consultaA.setHora("15:00");
                consultaA.setMedico(m1);
                consultaA.setPaciente(maria);
                consultaA.setMotivo("dor de barriga");
                consultaA.setHistorico("pare de comer besteira");
                consultaA.mostrar();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro "+ e.getMessage());
            }

            var receita123 = new Receita();
            try {
                receita123.setConsulta(consultaA);
                receita123.setData("21/08/2026");
                receita123.setDescritivo("buscopan + luftal");
                receita123.mostrar();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro "+ e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println("Erro geral: " + e.getMessage());
        }
    }
}
