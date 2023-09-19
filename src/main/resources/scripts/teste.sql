drop schema teste;

CREATE SCHEMA teste;
USE teste;

CREATE TABLE teste.fabricantes (
    id int auto_increment NOT NULL,
    nome varchar(400) NOT NULL,
    cnpj varchar(14) NOT NULL,
    cidade varchar(100) NOT NULL,
    cep int NOT NULL,
    uf varchar(2) NOT NULL,
    CONSTRAINT fabricantes_pk PRIMARY KEY (id)
);

CREATE TABLE teste.produtos (
    id int auto_increment NOT NULL,
    nome varchar(400) NOT NULL,
    id_fabricante int NOT NULL,
    valor DECIMAL NOT NULL,
    peso DECIMAL NOT NULL,
    data_cadastro DATE NOT NULL,
    CONSTRAINT produtos_pk PRIMARY KEY (id),
    CONSTRAINT id_fabricante foreign key (id_fabricante) references teste.fabricantes(ID)
);


select * from teste.produtos;
select * from teste.fabricantes;