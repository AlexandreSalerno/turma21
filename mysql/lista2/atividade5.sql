create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
	id bigint auto_increment,
	descricao varchar(255) not null,
	temEstoque boolean not null,
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

insert into tb_categoria (descricao, temEstoque) values ("Hidraulicos", true);
insert into tb_categoria (descricao, temEstoque) values ("Eletricos",true);
insert into tb_categoria (descricao, temEstoque) values ("Telhas",true);
insert into tb_categoria (descricao, temEstoque) values ("Tintas",true);
insert into tb_categoria (descricao, temEstoque) values ("Pisos",true);

insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Porcelanato",27.89,50,5);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Luminaria de emergencia",15.90,15,2);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Torneira eletrica",179.90,10,2);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Piso laminado prime",34.90,50,5);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Serra marmore",218.90,5,2);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Kit gabinete espelheira",149.90,3,1);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Telha romana ceramica",1.69,1000,3);
insert tb_produto (nome, preco, qtdProduto, categoria_id) values ("Suvinil toque de seda",80.00,100,4);

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
where tb_categoria.descricao = "Eletricos";


