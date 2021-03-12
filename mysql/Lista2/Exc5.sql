create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

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
categoria_id bigint,
quantidade int not null,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(departamento,ativo) values ("piso",true);
insert into tb_categoria(departamento,ativo) values ("iluminação",true);
insert into tb_categoria(departamento,ativo) values ("hidráulica",true);
insert into tb_categoria(departamento,ativo) values ("ferramentas",true);
insert into tb_categoria(departamento,ativo) values ("elétrica",true);

insert into tb_produto(nome,preco,categoria_id,quantidade) values ("azulejo",25.00,1,1000);
insert into tb_produto(nome,preco,categoria_id,quantidade) values ("lâmpada LED",12.50,2,500);
insert into tb_produto(nome,preco,categoria_id,quantidade) values ("luminária",200.00,2,50);
insert into tb_produto(nome,preco,categoria_id,quantidade) values ("tubo para esgoto",10.90,3,200);
insert into tb_produto(nome,preco,categoria_id,quantidade) values ("furadeira",259.90,4,70);
insert into tb_produto(nome,preco,categoria_id,quantidade) values ("tomada",6.90,5,1000);
insert into tb_produto(nome,preco,categoria_id,quantidade) values ("interruptor",12.90,5,1100);
insert into tb_produto(nome,preco,categoria_id,quantidade) values ("serra elétrica",309.70,4,90);

select * from tb_categoria;
select * from tb_produto;

select * from tb_produto where preco>50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%c%";
select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id;
select nome from tb_produto right join tb_categoria on tb_produto.categoria_id = 4;