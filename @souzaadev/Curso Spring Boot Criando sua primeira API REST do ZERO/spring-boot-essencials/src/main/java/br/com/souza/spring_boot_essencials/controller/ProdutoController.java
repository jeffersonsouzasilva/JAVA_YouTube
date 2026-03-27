package br.com.souza.spring_boot_essencials.controller;

import br.com.souza.spring_boot_essencials.database.model.ProdutoEntity;
import br.com.souza.spring_boot_essencials.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

//    @Autowired
//    private ProdutoService produtoService;

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll(){
        //ProdutoService produtoService = new ProdutoService();
        return produtoService.findAll();

    }

}
