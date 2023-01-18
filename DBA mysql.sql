CREATE DATABASE ecommerci;

USE ecommerci;

CREATE TABLE produtos (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    preco DECIMAL(5 , 2 ),
    quantidade INT,
    marca VARCHAR(255),
    PRIMARY KEY (id)
);
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Camisa",40.90,3,"Luxo");

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Calça",330.90,3,"mike");

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("meai",20.70,10,"nikkos");

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("tenis",400.70,2,"etnes");

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Bone",130.90,1,"onslay");

SELECT * FROM produtos;

CREATE DATABASE rh;

USE rh;

CREATE TABLE funcionario(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    funcao VARCHAR(255),
    salario DECIMAL(7.2),
    setor VARCHAR(255),
    PRIMARY KEY(id)

);
INSERT INTO funcionario(nome,funcao,salario,setor)
VALUES("Jorge","Ajudante",1500,"Limpeza");

INSERT INTO funcionario(nome,funcao,salario,setor)
VALUES("Maicon","Gerente",4500,"Fabril");

INSERT INTO funcionario(nome,funcao,salario,setor)
VALUES("Jonas","Soldador",2050,"Solda");

INSERT INTO funcionario(nome,funcao,salario,setor)
VALUES("José","Torneiro",2300,"Usinagem");

INSERT INTO funcionario(nome,funcao,salario,setor)
VALUES("Mario","Encarregado",3300,"Usinagem");

SELECT * FROM funcionario;

SELECT * FROM funcionario WHERE salario < 2000;

SELECT * FROM funcionario WHERE salario > 2000;

UPDATE funcionario
SET salario = 1700
WHERE id=1;

