package dobackaofront.SistemaDeFarmacia;

import dobackaofront.SistemaDeFarmacia.controller.BancoDeDados;
import dobackaofront.SistemaDeFarmacia.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class SistemaDeFarmaciaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SistemaDeFarmaciaApplication.class, args);
		System.out.println("Sistema de Farmacia");

//		Item dipirona = new Item("Dipirona 500mg",100,"Caixa");
//		Item bromoprida = new Item("Bromoprida 200mg",50,"Caixa");

//		BancoDeDados banco = new BancoDeDados();
//		banco.cadastrar(dipirona);
//		banco.cadastrar(bromoprida);

//		Item tilenol = new Item("Tilenol",150,"Frasco");

//		BancoDeDados banco = new BancoDeDados();
//		banco.cadastrar(tilenol);

//		BancoDeDados banco = new BancoDeDados();
//		ArrayList<Item> itens = banco.ler();

//		for (int i=0; i<itens.size(); i++){
//			System.out.println("Index: "+i+" - Nome: "+itens.get(i).getNome()+", Quantidade: "+itens.get(i).getQuantidade()+" - Tipo: "+itens.get(i).getTipo());
//		}


//		BancoDeDados banco = new BancoDeDados();
//		ArrayList<Item> itens = banco.ler();
//
//		Item item = banco.pesquisar(3,itens);
//
//		if (item != null){
//			System.out.println(item.getNome());
//		}else {
//			System.out.println("Não tem medicamento cadastrado com este código!");
//		}

		BancoDeDados banco = new BancoDeDados();
		ArrayList<Item> itens = banco.ler();
		
		banco.excluir(1,itens);

	}
}
