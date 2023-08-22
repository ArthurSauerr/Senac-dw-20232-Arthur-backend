package br.sc.senac.dw.exemplosdw.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "produtos")
public class ProdutoVO {

    @Id
    private Integer id;
    private String nome;
    private String fabricante;
    private double valor;
    private double peso;

    private LocalDate data_cadastro;


    public ProdutoVO(String nome, String fabricante, double valor, double peso, LocalDate data_cadastro) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.valor = valor;
        this.peso = peso;
        this.data_cadastro = data_cadastro;
    }

    public ProdutoVO() {
        super();
    }
}
