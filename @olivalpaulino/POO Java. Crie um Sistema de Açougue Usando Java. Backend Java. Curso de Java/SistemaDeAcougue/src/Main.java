
public class Main {
    public static void main(String[] args) {
        //Criando Produtos
        Produto picanha = new Produto("Picanha",79.90);
        Produto costela = new Produto("Costela", 29.90);

        //Criando funcionario
        Atendente atendente = new Atendente("Carlos", 1800);
        Acougueiro acougueiro = new Acougueiro("José", 2500);

        //Criando Pedido
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(picanha,1.5);
        pedido.adicionarProduto(costela, 2);

        //Exibir dados
        System.out.println("Dados dos Funcionarios --------------");
        atendente.exibirDados();
        acougueiro.exibirDados();

        System.out.println(" ");
        pedido.exibirPedido();
    }
}