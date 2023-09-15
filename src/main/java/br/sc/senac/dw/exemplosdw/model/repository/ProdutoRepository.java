package br.sc.senac.dw.exemplosdw.model.repository;

import java.util.List;

import br.sc.senac.dw.exemplosdw.model.vo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>, JpaSpecificationExecutor<Produto> {
    //É possível declarar métodos do JpaRepository aqui, combinando atributos e operadores SQL

    //https://reflectoring.io/spring-data-specifications/
    //Exemplo WHERE nome like '%123%'
    List<Produto> findAllByNomeLike(String nomeInformado);
}