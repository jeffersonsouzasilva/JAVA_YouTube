package br.com.souza.spring_boot_essencials.service;

import br.com.souza.spring_boot_essencials.database.model.ProdutoEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static final List<ProdutoEntity> PRODUTOS = List.of(
            ProdutoEntity.builder()
                    .id(1)
                    .nome("Notebook")
                    .preco(new BigDecimal(5000))
                    .quantidade(10)
                    .build(),
            ProdutoEntity.builder()
                    .id(2)
                    .nome("Iphone")
                    .preco(new BigDecimal(7000))
                    .quantidade(10)
                    .build(),
            ProdutoEntity.builder()
                    .id(3)
                    .nome("Mouse")
                    .preco(new BigDecimal(500))
                    .quantidade(10)
                    .build()
    );

    public static List<ProdutoEntity> findAll() {
        return new ArrayList<>(PRODUTOS);
    }

    public ProdutoEntity createProduct (ProdutoEntity produtoEntity){
        return produtoEntity;
    }
}
