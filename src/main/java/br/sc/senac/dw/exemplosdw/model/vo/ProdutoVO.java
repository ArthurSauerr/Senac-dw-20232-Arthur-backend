package br.sc.senac.dw.exemplosdw.model.vo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class ProdutoVO {
    private String nome;
    private String fabricante;
    private double preco;
    private int quantidade;
    private LocalDate data;

    public ProdutoVO(String nome, String fabricante, double preco, int quantidade, LocalDate data) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public ProdutoVO() {
        super();
    }
}
