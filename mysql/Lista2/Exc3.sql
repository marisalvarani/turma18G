create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
receita boolean not null,
primary key(id)
);

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
marca varchar(255) not null,
preco float not null,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(tipo,receita) values ("Cosméticos",false);
insert into tb_categoria(tipo,receita) values ("Vitaminas",false);
insert into tb_categoria(tipo,receita) values ("Medicamentos",true);
insert into tb_categoria(tipo,receita) values ("Acessórios",false);
insert into tb_categoria(tipo,receita) values ("Suplementos",false);

insert into tb_produto(nome,marca,preco,categoria_id) values ("Ibuprofeno","Advil",32.35,3);
insert into tb_produto(nome,marca,preco,categoria_id) values ("Vitamina C","Cebion",42.90,2);
insert into tb_produto(nome,marca,preco,categoria_id) values ("Paracetamol","Tylenol",27.50,3);
insert into tb_produto(nome,marca,preco,categoria_id) values ("Shake","Diet Way",65.90,5);
insert into tb_produto(nome,marca,preco,categoria_id) values ("Shampoo","Pantene",29.90,1);
insert into tb_produto(nome,marca,preco,categoria_id) values ("Máscara descartável","Health Care",9.90,4);
insert into tb_produto(nome,marca,preco,categoria_id) values ("Hidratane","Nivea",19.90,1);
insert into tb_produto(nome,marca,preco,categoria_id) values ("Batom","Maybelline",35.55,1);

select * from tb_categoria;
select * from tb_produto;

select * from tb_produto where preco>50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%b%";
select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id;
select nome from tb_produto right join tb_categoria on tb_produto.categoria_id = 1;