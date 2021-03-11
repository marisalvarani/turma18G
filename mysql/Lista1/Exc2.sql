create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    marca varchar(255) not null,
    preco float not null,
    unidades int not null,
    primary key (id)
);

insert into tb_produtos (nome,marca,preco,unidades) values ("Camiseta","Adidas",79.90,50);
insert into tb_produtos (nome,marca,preco,unidades) values ("Shorts","Rebook",59.90,25);
insert into tb_produtos (nome,marca,preco,unidades) values ("Tênis","New Balance",509.90,20);
insert into tb_produtos (nome,marca,preco,unidades) values ("Chinelo","Havaianas",29.90,30);
insert into tb_produtos (nome,marca,preco,unidades) values ("Calça","Levis",89.90,10);
insert into tb_produtos (nome,marca,preco,unidades) values ("Moletom","Puma",129.90,20);
insert into tb_produtos (nome,marca,preco,unidades) values ("Bermuda","Nike",49.90,40);
insert into tb_produtos (nome,marca,preco,unidades) values ("Vestido","Moda Praia",69.90,35);

select * from tb_produtos where preco>500;
select * from tb_produtos where preco<500;

update tb_produtos set tb_produtos.unidades = 20 where id = 2;

