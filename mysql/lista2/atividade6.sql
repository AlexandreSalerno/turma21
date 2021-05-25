create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
	id bigint auto_increment,
	materia varchar(255) not null,
	descricao varchar(255) not null,
	primary key (id)
);

create table tb_curso(
	id bigint auto_increment,
	nome varchar(255) not null,
	cargaHoraria int not null,
	preco float not null,
	categoria_id bigint,
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_categoria (materia, descricao) values ("Matematica", "Estuda a matematica de tudo");
insert into tb_categoria (materia, descricao) values ("Portugues", "Estuda as regras da lingua portuguesa");
insert into tb_categoria (materia, descricao) values ("Ciencias", "Estuda ciencias naturais e artificiais");
insert into tb_categoria (materia, descricao) values ("Geografia", "Estuda o mundo e suas coordenas");
insert into tb_categoria (materia, descricao) values ("História", "Estuda a história do mundo");

insert tb_curso (nome, cargaHoraria, preco, categoria_id) values ("Funções aritmeticas",60,5.00,1);
insert tb_curso (nome, cargaHoraria, preco, categoria_id) values ("Verbos",40,5.00,2);
insert tb_curso (nome, cargaHoraria, preco, categoria_id) values ("Funçoes do corpo",80,10.00,3);
insert tb_curso (nome, cargaHoraria, preco, categoria_id) values ("Localizaçoes",60,5.00,4);
insert tb_curso (nome, cargaHoraria, preco, categoria_id) values ("Segunda guerra mundial",50,10.00,5);
insert tb_curso (nome, cargaHoraria, preco, categoria_id) values ("Primeira guerra mundial",50,10.00,5);
insert tb_curso (nome, cargaHoraria, preco, categoria_id) values ("Ditadura no Brasil",50,10.00,5);
insert tb_curso (nome, cargaHoraria, preco, categoria_id) values ("Redaçoes",40,20.00,2);

select * from tb_curso where preco > 50.00;

select * from tb_curso where preco between 3.00 and 60.00;

select * from tb_curso where nome like "J%";

select * 
from tb_categoria 
inner join tb_curso 
on tb_categoria.id = tb_curso.categoria_id;

select * 
from tb_categoria 
inner join tb_curso 
on tb_categoria.id = tb_curso.categoria_id
where tb_categoria.materia = "Historia";


