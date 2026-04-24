import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // Atributos da classe pedido
    private List<Produto> produtos = new ArrayList<>();
    private List<Double> quantidades = new ArrayList<>();

    public Pedido() {

    }

    public void adicionarProduto(Produto produto, double quantidadeKg){
        produtos.add(produto);
        quantidades.add(quantidadeKg);
    }

    public double calcularTotal(){
        double total = 0;

        for (int i=0; i<produtos.size(); i++){
            total += produtos.get(i).calcularPreco(quantidades.get(i));
        }

        return total;
    }

    public void exibirPedido(){
        System.out.println("Resumo do Pedido: ");

        for (int i=0; i<produtos.size(); i++){
            System.out.println(
                    produtos.get(i).getNome()+" - "
                    +quantidades.get(i)+" kg - R$ "
                    +produtos.get(i).calcularPreco(quantidades.get(i)));
        }
        System.out.println("Total : R$ "+calcularTotal());
    }
}
