package br.sc.senac.dw.exemplosdw.controller;

import br.sc.senac.dw.exemplosdw.exceptions.CampoInvalidoException;
import br.sc.senac.dw.exemplosdw.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import br.sc.senac.dw.exemplosdw.model.vo.ProdutoVO;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping(path = "/todos")
    public List<ProdutoVO> listarTodosProdutos() {
        return produtoService.listarTodos();
    }

    @GetMapping(path = "/{id}")
    public ProdutoVO consultarPorId(@PathVariable Integer id) {
        return produtoService.consultarPorId(id.longValue());
    }

    @PostMapping
    public ProdutoVO inserir(@RequestBody ProdutoVO novoProduto) throws CampoInvalidoException {
        return produtoService.inserir(novoProduto);
    }

    @PutMapping()
    public boolean atualizar(@RequestBody ProdutoVO produtoParaAtualizar)throws CampoInvalidoException{
        return produtoService.atualizar(produtoParaAtualizar);
    }

    @DeleteMapping("/{id}")
    public boolean excluir(@PathVariable Integer id){
        return produtoService.excluir(id);
    }
}
