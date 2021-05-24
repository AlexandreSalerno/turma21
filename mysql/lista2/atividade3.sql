create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
	id bigint auto_increment,
    tipo varchar(100) not null,
	classificacao varchar(100) not null,
    primary key (id)
);

create table tb_produto (
	id bigint auto_increment,
    nome varchar(255) not null,
    preco float not null,
    descricao varchar(255) not null,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_categoria (tipo, classificacao) values ("Genérico", "Analgésico");
insert into tb_categoria (tipo, classificacao) values ("Marca", "Ansiolíticos");
insert into tb_categoria (tipo, classificacao) values ("Similar", "Sonífero");
insert into tb_categoria (tipo, classificacao) values ("Genérico", "Antibiótico");
insert into tb_categoria (tipo, classificacao) values ("Marca", "Ácido acetilsalicílico");

insert into tb_produto (nome, preco, descricao, categoria_id)
values ("Dipirona", 15.99, "Alivia dores de cabeça e febre", 1);
insert into tb_produto (nome, preco, descricao, categoria_id)
values ("Paracetamol", 15.99, "Alivia inflamação e dores de garganta, febre", 1);
insert into tb_produto (nome, preco, descricao, categoria_id)
values ("Calman", 25.00, "Calmante", 2);
insert into tb_produto (nome, preco, descricao, categoria_id)
values ("Sintocalmy", 63.00, "Calmante", 2);
insert into tb_produto (nome, preco, descricao, categoria_id)
values ("Ritmoneuran", 14.39, "Calmante", 2);
insert into tb_produto (nome, preco, descricao, categoria_id)
values ("Amoxicilina", 90.00, "Tratamento de infecções bacterianas", 4);
insert into tb_produto (nome, preco, descricao, categoria_id)
values ("Diazepam", 10.00, "Alivia dores de cabeça e febre", 3);
insert into tb_produto (nome, preco, descricao, categoria_id)
values ("Aspirina", 20.99, "Alivio sintomatico de dores leve a moderado", 5);


select * from tb_produto where preco > 50.00;

select * from tb_produto where preco between 3.00 and 60.00;

select * from tb_produto where nome like "B%";

select * 
from tb_categoria 
inner join tb_produto 
on tb_categoria.id = tb_produto.categoria_id;

select * 
from tb_categoria 
inner join tb_produto 
on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.classificacao = "Ansiolíticos";