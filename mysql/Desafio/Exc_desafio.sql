create database db_nome_minha_casa_mais_bonita;

use db_nome_minha_casa_mais_bonita;

create table tb_categoria(
id bigint auto_increment,
departamento varchar(255) not null,
ativo boolean not null,
primary key(id)
);

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
quantidade int not null,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

create table tb_usuario(
id bigint auto_increment,
nome varchar(255) not null,
cpf varchar(255) not null,
idade int not null,
sexo varchar(1) not null,
primary key(id)
);

insert into tb_categoria(departamento,ativo) values ("Móveis",true);
insert into tb_categoria(departamento,ativo) values ("Decoração",true);
insert into tb_categoria(departamento,ativo) values ("Cama, mesa e banho",true);

insert into tb_produto(nome,preco,quantidade,categoria_id) values ("cortina",150.00,120,2);
insert into tb_produto(nome,preco,quantidade,categoria_id) values ("toalha",35.00,100,3);
insert into tb_produto(nome,preco,quantidade,categoria_id) values ("sofá",400.00,30,1);
insert into tb_produto(nome,preco,quantidade,categoria_id) values ("quadro",45.00,20,2);
insert into tb_produto(nome,preco,quantidade,categoria_id) values ("espelho",50.00,10,2);

insert into tb_usuario(nome,cpf,idade,sexo) values ("Marcia",111111111,34,"F");
insert into tb_usuario(nome,cpf,idade,sexo) values ("Carolina",222222222,27,"F");
insert into tb_usuario(nome,cpf,idade,sexo) values ("Rafael",333333333,40,"M");

select * from tb_categoria;
select * from tb_produto;
select * from tb_usuario;

select * from tb_produto where preco>50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%b%";
select * from tb_usuario where nome like "%c%";
select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id;
select avg(preco) as media from tb_produto;
select sum(preco) from tb_produto;
select count(*) from tb_produto;
select nome from tb_produto right join tb_categoria on tb_produto.categoria_id = 2;