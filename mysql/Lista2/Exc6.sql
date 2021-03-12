create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
departamento varchar(255) not null,
ativo boolean not null,
primary key(id)
);

create table tb_curso(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
duracao_horas int not null,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(departamento,ativo) values ("Java",true);
insert into tb_categoria(departamento,ativo) values ("Excel",true);
insert into tb_categoria(departamento,ativo) values ("Python",true);

insert into tb_curso(nome,preco,duracao_horas,categoria_id) values ("Java básico",100.00,55,1);
insert into tb_curso(nome,preco,duracao_horas,categoria_id) values ("Excel avançado",70.00,35,2);
insert into tb_curso(nome,preco,duracao_horas,categoria_id) values ("Python intensivo",90.00,40,3);
insert into tb_curso(nome,preco,duracao_horas,categoria_id) values ("Excel para iniciantes",30.00,10,2);
insert into tb_curso(nome,preco,duracao_horas,categoria_id) values ("Java Completo",170.00,100,1);

select * from tb_categoria;
select * from tb_curso;

select * from tb_curso where preco>50;
select * from tb_curso where preco between 3 and 60;
select * from tb_curso where nome like "%j%";
select * from tb_curso inner join tb_categoria on tb_curso.categoria_id = tb_categoria.id;
select nome from tb_curso right join tb_categoria on tb_curso.categoria_id = 1;

