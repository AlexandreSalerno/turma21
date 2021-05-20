create database db_ecommerce;

use db_ecommerce;

create table tb_produto (
	id bigint auto_increment,
    nome varchar(255) not null,
    preco float not null,
    descricao varchar(255) not null,
    tipo varchar(255) not null,
    primary key (id)
);

insert into tb_produto (nome, preco, descricao, tipo) 
values ("Notebook", 1500.00, "Notebook i5 (SSD 500GB)", "Eletrônico");

insert into tb_produto (nome, preco, descricao, tipo) 
values ("TV", 2000.00, "TV Smart 26 polegadas", "Eletrônico");

insert into tb_produto (nome, preco, descricao, tipo) 
values ("Banana", 5.00, "Cacho, prata", "Alimento");

insert into tb_produto (nome, preco, descricao, tipo) 
values ("Macarrão instantâneo", 3.00, "Galinha Caipira", "Alimento");

insert into tb_produto (nome, preco, descricao, tipo) 
values ("Sofá", 5000.00, "Ultra conforto, 2m", "Móvel");

insert into tb_produto (nome, preco, descricao, tipo) 
values ("Cadeira", 150.00, "Modelo escritório", "Móvel");

insert into tb_produto (nome, preco, descricao, tipo) 
values ("Pasta de dente", 4.00, "Colgate", "Higiene");

insert into tb_produto (nome, preco, descricao, tipo) 
values ("Papel higiênico", 20.00, "Folha dupla, leve", "Higiene");


select * from tb_produto where preco > 500.00;

select * from tb_produto where preco < 500.00;

update tb_produto set preco = 100.00 where id = 6;