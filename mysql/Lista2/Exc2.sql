create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
pedacos int not null,
primary key (id)
);

create table tb_pizza(
id bigint auto_increment,
sabor varchar(255) not null,
preco float not null,
ingredientes varchar(255) not null,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria (tipo,pedacos) values ("Queijo",8);
insert into tb_categoria (tipo,pedacos) values ("Presunto",8);
insert into tb_categoria (tipo,pedacos) values ("Vegetariana",8);
insert into tb_categoria (tipo,pedacos) values ("Frango",8);
insert into tb_categoria (tipo,pedacos) values ("Doce",8);

insert into tb_pizza (sabor,preco,ingredientes,categoria_id) values ("Dois queijos",25.90,"Mussarela e catupiry",1);
insert into tb_pizza (sabor,preco,ingredientes,categoria_id) values ("Marguerita",28.90,"Mussarela, tomate e manjericão",1);
insert into tb_pizza (sabor,preco,ingredientes,categoria_id) values ("Portuguesa",59.90,"Mussarela, presunto, cebola e ovo",2);
insert into tb_pizza (sabor,preco,ingredientes,categoria_id) values ("Brócolis",45.90,"Mussarela, brócolis e catupiry",3);
insert into tb_pizza (sabor,preco,ingredientes,categoria_id) values ("Frango",55.90,"Frango e catupiry",4);
insert into tb_pizza (sabor,preco,ingredientes,categoria_id) values ("Brigadeiro",43.90,"Brigadeiro e granulado",5);
insert into tb_pizza (sabor,preco,ingredientes,categoria_id) values ("Banana",32.90,"Banana com canela",5);
insert into tb_pizza (sabor,preco,ingredientes,categoria_id) values ("Romeu e Julieta",42.90,"Queijo branco e goiabada",5);

select * from tb_pizza;
select * from tb_categoria;

select * from tb_pizza where preco>45;
select * from tb_pizza where preco between 29 and 60;
select * from tb_pizza where sabor like "%c%";
select * from tb_pizza inner join tb_categoria on tb_pizza.categoria_id = tb_categoria.id;
select sabor,preco,ingredientes from tb_pizza right join tb_categoria on tb_pizza.categoria_id = 1;