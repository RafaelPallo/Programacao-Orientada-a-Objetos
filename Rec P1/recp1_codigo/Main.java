public class Main {
    public static void main(String[] args) {
        
        Sabor calabresa = new Sabor("Calabresa", 45.0);
        Sabor marguerita = new Sabor("Marguerita", 48.0);
        Borda catupiry = new Borda("Catupiry", 8.0);
        Adicional bacon = new Adicional("Bacon", 5.0);

        Pizza pizza = new Pizza("GRANDE");
        pizza.adicionarSabor(calabresa);
        pizza.adicionarSabor(marguerita);
        pizza.setBorda(catupiry);
        pizza.adicionarAdicional(bacon);

        // Cardapio
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarPizza(pizza);

        // Cliente com endereco 
        Cliente cliente = new Cliente(1, "Maria Souza", "11 99999-0000", "maria@email.com");
        cliente.cadastrar();
        Endereco casa = cliente.adicionarEndereco("Rua das Flores", "123", "Centro", "Sao Paulo", "01000-000");

        // Pedido com itens
        Pedido pedido = new Pedido(1, cliente, casa, "Entrega");
        pedido.adicionarItem(pizza, 2, "Sem cebola");
        System.out.printf("Total do pedido: R$ %.2f%n", pedido.calcularTotal());

        // Pagamento online 
        Pagamento pagamento = new Pix(pedido.calcularTotal(), "pizzaria@pix.com");
        pagamento.processarPagamento();
        pedido.setPagamento(pagamento);

        // Painel administrativo
        PainelAdministrativo painel = new PainelAdministrativo();
        painel.receberPedido(pedido);
        painel.alterarStatus(pedido, "EM PREPARO");
        painel.alterarStatus(pedido, "SAIU PARA ENTREGA");
        painel.alterarStatus(pedido, "CONCLUIDO");

        // Atualizacao do cardapio
        cardapio.atualizarPreco("Calabresa", 50.0);

        System.out.println("Pedidos no historico de " + cliente.getNome() + ": "
                + cliente.consultarHistorico().size());
        System.out.println("Entrega em: " + pedido.getEnderecoEntrega());
    }
}
