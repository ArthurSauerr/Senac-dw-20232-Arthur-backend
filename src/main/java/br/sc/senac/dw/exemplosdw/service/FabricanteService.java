package br.sc.senac.dw.exemplosdw.service;

import br.sc.senac.dw.exemplosdw.exceptions.CampoInvalidoException;
import br.sc.senac.dw.exemplosdw.model.repository.FabricanteRepository;
import br.sc.senac.dw.exemplosdw.model.vo.Fabricante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricanteService {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    public List<Fabricante> listarTodos() {
        return fabricanteRepository.findAll();
    }
    public Fabricante inserir(Fabricante novoFabricante) throws CampoInvalidoException{
        return fabricanteRepository.save(novoFabricante);
    }



}
