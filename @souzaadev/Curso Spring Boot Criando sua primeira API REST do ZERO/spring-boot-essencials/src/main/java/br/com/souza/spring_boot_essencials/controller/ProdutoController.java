package br.com.souza.spring_boot_essencials.controller;

import br.com.souza.spring_boot_essencials.database.model.ProdutoEntity;
import br.com.souza.spring_boot_essencials.dto.ProdutoDto;
import br.com.souza.spring_boot_essencials.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public ProdutoEntity createProduct(@RequestBody ProdutoDto produtoDto){
//        return produtoService.createProduct(produtoDto);
//    }
//
//    @PutMapping("/{id}")
//    @ResponseStatus(HttpStatus.CREATED)
//    public ProdutoEntity updateProduct(@PathVariable Integer id,
//                                       @RequestBody ProdutoDto produtoDto) throws NotFoundException{
//        return produtoService.atualizarProduto(produtoDto, id);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteProduct(@PathVariable Integer id){
//        produtoService.removerProduto(id);
//    }

}
