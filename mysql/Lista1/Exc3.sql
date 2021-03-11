create database db_escola;

use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
serie int not null,
idade int not null,
nota float not null,
primary key (id)
);

insert into tb_alunos (nome,serie,idade,nota) values ("Clara",1,7,8.5);
insert into tb_alunos (nome,serie,idade,nota) values ("Maria Eduarda",2,8,9.5);
insert into tb_alunos (nome,serie,idade,nota) values ("Arthur",1,7,7.5);
insert into tb_alunos (nome,serie,idade,nota) values ("Júlio",3,9,6.5);
insert into tb_alunos (nome,serie,idade,nota) values ("Gabriela",4,10,7);
insert into tb_alunos (nome,serie,idade,nota) values ("Felipe",2,8,6);
insert into tb_alunos (nome,serie,idade,nota) values ("Natália",4,10,8);
insert into tb_alunos (nome,serie,idade,nota) values ("Rafael",1,7,5);

select * from tb_alunos;

select * from tb_alunos where nota>7;
select * from tb_alunos where nota<7;

update tb_alunos set tb_alunos.nota = 7.5 where id=4;



