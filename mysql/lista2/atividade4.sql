create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
	id bigint auto_increment,
	descricao varchar(255) not null,
	ativo boolean not null,
	primary key (id)
);

create table tb_produto(
	id bigint auto_increment,
	nome varchar(255) not null,
	preco float not null,
	qtdProduto int not null,
	categoria_id bigint,
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_categoria (descricao, ativo) values ("Bovino", true);
insert into tb_categoria (descricao, ativo) values ("Suino",true);
insert into tb_categoria (descricao, ativo) values ("Aves",true);
insert into tb_categoria (descricao, ativo) values ("Imbutidos",true);
insert into tb_categoria (descricao, ativo) values ("Outros",true);

insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Picanha",20.00,30,1);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Coxa de frango",20.00,30,3);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Bacon",30.00,30,1);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Hamburguer",60.00,30,5);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Peito de frango",25.00,30,3);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Orelha de porco",20.00,30,4);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Salame",18.00,30,5);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Medalhao",50.00,30,3);

select * from tb_produto where preco > 50.00;

select * from tb_produto where preco between 3.00 and 60.00;

select * from tb_produto where nome like "C%";

select * 
from tb_categoria 
inner join tb_produto 
on tb_categoria.id = tb_produto.categoria_id;

select * 
from tb_categoria 
inner join tb_produto 
on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.descricao = "Aves";


