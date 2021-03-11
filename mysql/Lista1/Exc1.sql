create database db_rh;

use db_rh;

create table tb_funcionarios (
	id bigint auto_increment,
    nome varchar(255) not null,
    funcao varchar(255) not null,
    idade int not null,
    salario float not null,
    primary key(id)
    );
    
insert into tb_funcionarios (nome,funcao,idade,salario) values ("Maria","Assistente administrativo",25,1500);
insert into tb_funcionarios (nome,funcao,idade,salario) values ("Carlos","Assistente almoxarifado",22,1750);
insert into tb_funcionarios (nome,funcao,idade,salario) values ("Carolina","Gerente",33,2500);
insert into tb_funcionarios (nome,funcao,idade,salario) values ("Alberto","Supervisor",30,2000);
insert into tb_funcionarios (nome,funcao,idade,salario) values ("Fernanda","Analista",28,1800);

select * from tb_funcionarios;

select * from tb_funcionarios where salario>2000;
select * from tb_funcionarios where salario<2000;

update tb_funcionarios set tb_funcionarios.salario = 2100 where id = 4;



