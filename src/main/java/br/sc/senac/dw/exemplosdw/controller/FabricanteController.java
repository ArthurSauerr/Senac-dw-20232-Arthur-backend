package br.sc.senac.dw.exemplosdw.controller;

import br.sc.senac.dw.exemplosdw.exceptions.CampoInvalidoException;
import br.sc.senac.dw.exemplosdw.model.vo.Fabricante;
import br.sc.senac.dw.exemplosdw.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/fabricantes")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:5500"}, maxAge = 3600)
public class FabricanteController {

    @Autowired
    private FabricanteService fabricanteService;

    @GetMapping
    public List<Fabricante> listarTodos(){
        List<Fabricante> fabricantes = fabricanteService.listarTodos();
        return fabricantes;
    }

    @PostMapping
    public Fabricante cadastrar(@RequestBody Fabricante novoFabricante) throws CampoInvalidoException {
        return fabricanteService.inserir(novoFabricante);

    }


}
