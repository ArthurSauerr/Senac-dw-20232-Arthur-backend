create database teste;
use teste;

CREATE TABLE teste.produtos (
	id int auto_increment NOT NULL,
	nome varchar(400) NOT NULL,
	fabricante varchar(400) NOT NULL,
	valor DECIMAL NOT NULL,
	peso DECIMAL NOT NULL,
	data_cadastro DATE NOT NULL,
	CONSTRAINT produtos_pk PRIMARY KEY (id)
);

INSERT INTO exemplos.produtos (nome, fabricante, valor, peso, data_cadastro)
VALUES('Café', 'Ouro', 12.5, 0.5, sysdate());

INSERT INTO exemplos.produtos (nome, fabricante, valor, peso, data_cadastro)
VALUES('Chinela', 'Rasteiras de madeira', 80.5, 0.2, sysdate());