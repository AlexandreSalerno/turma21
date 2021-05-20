create database db_escola;

use db_escola;

create table tb_aluno (
	id bigint auto_increment,
    nome varchar(255) not null,
    nota float not null,
    tipo varchar(255) not null,
    turma varchar(255) not null,
    primary key (id)
);

insert into tb_aluno (nome, nota, tipo, turma) 
values ("Maria", 8.0, "ENSINO MÉDIO", "A1");

insert into tb_aluno (nome, nota, tipo, turma) 
values ("João", 7.0, "ENSINO MÉDIO", "A2");

insert into tb_aluno (nome, nota, tipo, turma) 
values ("Pedro", 9.0, "ENSINO MÉDIO", "B1");

insert into tb_aluno (nome, nota, tipo, turma) 
values ("Letícia", 10.0, "ENSINO MÉDIO", "A1");

insert into tb_aluno (nome, nota, tipo, turma) 
values ("Abel", 6.0, "ENSINO FUNDAMENTAL", "C1");

insert into tb_aluno (nome, nota, tipo, turma) 
values ("José", 7.5, "ENSINO FUNDAMENTAL", "E5");

insert into tb_aluno (nome, nota, tipo, turma) 
values ("Bruna", 8.0, "ENSINO FUNDAMENTAL", "F2");

insert into tb_aluno (nome, nota, tipo, turma) 
values ("Antônia", 5.0, "ENSINO FUNDAMENTAL", "E2");


select * from tb_aluno where nota > 7.0;

select * from tb_aluno where nota < 7.0;

update tb_aluno set nota = 6.0 where id = 8;