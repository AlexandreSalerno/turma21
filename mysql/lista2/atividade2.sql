create database db_pizarria_legal;

use db_pizarria_legal;

create table tb_categoria (
	id bigint auto_increment,
    tamanho varchar(50) not null,
	doce boolean not null,
    primary key (id)
);

create table tb_pizza (
	id bigint auto_increment,
    nome varchar(255) not null,
    preco float not null,
    sabor varchar(255) not null,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_categoria (tamanho, doce) values ("Grande", false);
insert into tb_categoria (tamanho, doce) values ("Grande", true);
insert into tb_categoria (tamanho, doce) values ("Broto", false);
insert into tb_categoria (tamanho, doce) values ("Broto", true);

insert into tb_pizza (nome, preco, sabor, categoria_id)
values ("Calabresa", 27.00, "Calabresa, cebola e mussarela", 1);
insert into tb_pizza (nome, preco, sabor, categoria_id)
values ("Brigadeiro", 50.00, "Brigadeiro", 2);
insert into tb_pizza (nome, preco, sabor, categoria_id)
values ("Banana", 25.00, "Chocolate e banana", 4);
insert into tb_pizza (nome, preco, sabor, categoria_id)
values ("Baiana", 27.00, "Calabresa, cebola e pimenta", 1);
insert into tb_pizza (nome, preco, sabor, categoria_id)
values ("Carijó", 45.00, "Frango, milho e catupiry", 1);
insert into tb_pizza (nome, preco, sabor, categoria_id)
values ("Portuguesa", 35.00, "Presunto, muçarela, ervilha, milho, cebola, ovo e pimentão", 1);
insert into tb_pizza (nome, preco, sabor, categoria_id)
values ("Mista", 25.00, "Presunto, muçarela e tomate", 3);
insert into tb_pizza (nome, preco, sabor, categoria_id)
values ("4 queijos", 45.00, "Muçarela, queijo prato, provolone e catupiry", 1);


select * from tb_pizza where preco > 45.00;

select * from tb_pizza where preco between 29.00 and 60.00;

select * from tb_pizza where nome like "C%";

select * 
from tb_categoria 
inner join tb_pizza 
on tb_categoria.id = tb_pizza.categoria_id;

select * 
from tb_categoria 
inner join tb_pizza 
on tb_categoria.id = tb_pizza.categoria_id
where tb_categoria.doce = true;