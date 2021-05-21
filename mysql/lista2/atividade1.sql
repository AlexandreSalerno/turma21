create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
	id bigint auto_increment,
    nome varchar(255) not null,
	descricao varchar(255) not null,
    primary key (id)
);

create table tb_personagem (
	id bigint auto_increment,
    nome varchar(255) not null,
    poderAtk int not null,
    poderDef int not null,
    classe_id bigint,
    primary key (id),
    foreign key (classe_id) references tb_classe (id)
);

insert into tb_classe (nome, descricao) values ("Guerreiro", "Combatente corpo-a-corpo balanceado");
insert into tb_classe (nome, descricao) values ("Arqueiro", "Combatente à distância");
insert into tb_classe (nome, descricao) values ("Mago", "Combatente de magia à distância");
insert into tb_classe (nome, descricao) values ("Curador", "Suporte");
insert into tb_classe (nome, descricao) values ("Assassino", "Combatente corpo-a-corpo com muito poder ofensivo, porém vunerável");

insert into tb_personagem (nome, poderAtk, poderDef, classe_id)
values ("PunhosDeFerro", 1000, 3000, 1);
insert into tb_personagem (nome, poderAtk, poderDef, classe_id)
values ("tiroaoalvo", 2500, 1000, 2);
insert into tb_personagem (nome, poderAtk, poderDef, classe_id)
values ("darksidexx", 3000, 800, 3);
insert into tb_personagem (nome, poderAtk, poderDef, classe_id)
values ("Vento", 1500, 1500, 4);
insert into tb_personagem (nome, poderAtk, poderDef, classe_id)
values ("shadow99", 3500, 500, 5);
insert into tb_personagem (nome, poderAtk, poderDef, classe_id)
values ("cura1000", 2000, 1000, 4);
insert into tb_personagem (nome, poderAtk, poderDef, classe_id)
values ("XxMestreDaGuerraxX", 2000, 2000, 1);
insert into tb_personagem (nome, poderAtk, poderDef, classe_id)
values ("MindART", 2500, 1200, 3);

select * from tb_personagem where poderAtk > 2000;

select * from tb_personagem where poderDef between 1000 and 2000;

select * from tb_personagem where nome like "C%";

select * 
from tb_classe 
inner join tb_personagem 
on tb_classe.id = tb_personagem.classe_id;

select * 
from tb_classe 
inner join tb_personagem 
on tb_classe.id = tb_personagem.classe_id
where tb_classe.nome = "Curador";