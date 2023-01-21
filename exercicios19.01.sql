CREATE DATABASE db_games;

USE db_games;


CREATE TABLE db_classes(
id BIGINT AUTO_INCREMENT,
forca INT,
inteligencia INT,
raca VARCHAR(255),
PRIMARY KEY(id)
);

CREATE TABLE db_personagem(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(255),
idade INT,
etinia VARCHAR(255),
sexo VARCHAR(255),
altura DECIMAL(4,2),
classe_id BIGINT,

PRIMARY KEY(id),
FOREIGN KEY (classe_id) REFERENCES db_classes(id)

);

INSERT INTO db_classes(forca,inteligencia,raca)
VALUE (2500,1500,"Guerreiro");

INSERT INTO db_classes(forca,inteligencia,raca)
VALUE (1500,3000,"Mago");

INSERT INTO db_classes(forca,inteligencia,raca)
VALUE (2000,2000,"Anão");

INSERT INTO db_classes(forca,inteligencia,raca)
VALUE (1800,2200,"Elf");

select * from db_classes;

INSERT INTO db_personagem (nome,idade,etinia,sexo,altura,classe_id)
VALUE ("maik",23,"amarelo","homo",1.90,1);

INSERT INTO db_personagem (nome,idade,etinia,sexo,altura,classe_id)
VALUE ("maria",28,"roxo","hetero",1.65,4);

INSERT INTO db_personagem (nome,idade,etinia,sexo,altura,classe_id)
VALUE ("Wilson",20,"azul","Hetero",1.31,3);

INSERT INTO db_personagem (nome,idade,etinia,sexo,altura,classe_id)
VALUE ("Jimo",22,"rosa","gay",1.90,2);

INSERT INTO db_personagem (nome,idade,etinia,sexo,altura,classe_id)
VALUE ("Milka",24,"preta","hetero",1.70,1);

select * from db_personagem;

SELECT * FROM db_classes WHERE forca > 1000 AND forca < 2000;

SELECT * FROM db_personagem
WHERE nome LIKE "%M%";


SELECT * FROM db_classes 
INNER JOIN db_personagem
ON db_classes.id = db_personagem.classe_id


