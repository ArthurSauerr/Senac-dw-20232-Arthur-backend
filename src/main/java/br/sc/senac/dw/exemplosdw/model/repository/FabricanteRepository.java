package br.sc.senac.dw.exemplosdw.model.repository;

import br.sc.senac.dw.exemplosdw.model.vo.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long>, JpaSpecificationExecutor<Fabricante> {
    //É possível declarar métodos do JpaRepository aqui, combinando atributos e operadores SQL

    //https://reflectoring.io/spring-data-specifications/
    //Exemplo WHERE nome like '%123%'
    List<Fabricante> findAllByNomeLike(String nomeInformado);
}