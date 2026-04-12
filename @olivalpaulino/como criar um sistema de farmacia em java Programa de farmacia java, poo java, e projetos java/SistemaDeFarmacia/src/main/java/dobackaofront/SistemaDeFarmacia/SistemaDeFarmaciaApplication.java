package dobackaofront.SistemaDeFarmacia;

import dobackaofront.SistemaDeFarmacia.controller.BancoDeDados;
import dobackaofront.SistemaDeFarmacia.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		Item tilenol = new Item("Tilenol",150,"Frasco");

		BancoDeDados banco = new BancoDeDados();
		banco.cadastrar(tilenol);

	}
}
