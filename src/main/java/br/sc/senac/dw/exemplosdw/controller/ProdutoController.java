package br.sc.senac.dw.exemplosdw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

import br.sc.senac.dw.exemplosdw.model.vo.ProdutoVO;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    @GetMapping
    public ArrayList<ProdutoVO> listarTodosProdutos(){
        ProdutoVO p1 = new ProdutoVO("Produto 1", "Fabricante 1", 10, 1, LocalDate.now());
        ProdutoVO p2 = new ProdutoVO("Produto 2", "Fabricante 2", 20, 2, LocalDate.now());
        ProdutoVO p3 = new ProdutoVO("Produto 3", "Fabricante 3", 30, 3, LocalDate.now());

        ArrayList<ProdutoVO> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        return lista;
    }
}
