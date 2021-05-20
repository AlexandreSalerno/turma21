create database db_rh;

use db_rh;

create table tb_funcionario (
	id bigint auto_increment,
    nome varchar(255) not null,
    salario float not null,
    telefoneCelular varchar(20) not null,
    departamento varchar(255) not null,
    primary key (id)
);

insert into tb_funcionario (nome, salario,telefoneCelular,departamento) 
values ("Maria", 3000.00, "(11) 00000-0000", "Financeiro");

insert into tb_funcionario (nome, salario,telefoneCelular,departamento) 
values ("João", 3000.00, "(11) 11111-1111", "Financeiro");

insert into tb_funcionario (nome, salario,telefoneCelular,departamento) 
values ("Abel", 1500.00, "(11) 22222-2222", "Vendas");

insert into tb_funcionario (nome, salario,telefoneCelular,departamento) 
values ("Bruno", 2500.00, "(11) 33333-3333", "RH");

insert into tb_funcionario (nome, salario,telefoneCelular,departamento) 
values ("Lídia", 3500.00, "(11) 44444-4444", "TI");

select * from tb_funcionario where salario > 2000.00;

select * from tb_funcionario where salario < 2000.00;

update tb_funcionario set salario = 1999.99 where id = 2;