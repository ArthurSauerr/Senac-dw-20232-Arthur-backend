drop schema EXEMPLOS;

CREATE SCHEMA EXEMPLOS;
USE EXEMPLOS;

CREATE TABLE exemplos.fabricantes (
    id int auto_increment NOT NULL,
    nome varchar(400) NOT NULL,
    cnpj varchar(14) NOT NULL,
    CONSTRAINT fabricantes_pk PRIMARY KEY (id)
);

CREATE TABLE exemplos.produtos (
    id int auto_increment NOT NULL,
    nome varchar(400) NOT NULL,
    id_fabricante int NOT NULL,
    valor DECIMAL NOT NULL,
    peso DECIMAL NOT NULL,
    data_cadastro DATE NOT NULL,
    CONSTRAINT produtos_pk PRIMARY KEY (id),
    CONSTRAINT id_fabricante foreign key (id_fabricante) references exemplos.fabricantes(ID)
);

INSERT INTO exemplos.fabricantes (nome, cnpj)
VALUES('Ouro', '11222333000022');

INSERT INTO exemplos.fabricantes (nome, cnpj)
VALUES('Pelé', '10222333000022');

INSERT INTO exemplos.fabricantes (nome, cnpj)
VALUES('Havaianas', '55222333000022');

INSERT INTO exemplos.fabricantes (nome, cnpj)
VALUES('Rider', '88222333000022');

INSERT INTO exemplos.produtos (nome, id_fabricante, valor, peso, data_cadastro)
VALUES('Café', 1, 12.5, 0.5, sysdate());

INSERT INTO exemplos.produtos (nome, id_fabricante, valor, peso, data_cadastro)
VALUES('Café', 2, 10.0, 0.5, sysdate());

INSERT INTO exemplos.produtos (nome, id_fabricante, valor, peso, data_cadastro)
VALUES('Chinela de tira', 3, 80.5, 0.2, sysdate());

INSERT INTO exemplos.produtos (nome, id_fabricante, valor, peso, data_cadastro)
VALUES('Chinela pesada', 4, 70.2, 0.3, sysdate());