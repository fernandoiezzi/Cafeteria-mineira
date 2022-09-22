create database if not exists cafeteria;
use cafeteria;

create table if not exists cliente(
id_cliente int not null auto_increment,
nome varchar(100) not null,
telefone varchar(100),
endereco varchar(100) not null,
cidade varchar(100) not null,
bairro varchar(100) not null,
estado varchar(100) not null,
primary key(id_cliente));

create table if not exists venda(
id_venda int not null auto_increment,
id_clientevenda int not null,
id_funcionariovenda int not null,
Idproduto int not null,
quantidade int not null,
valorunitario decimal(11,2) not null,
primary key (id_venda),
foreign key (id_clientevenda) references cafeteria.cliente(id_cliente),
foreign key (id_funcionariovenda) references cafeteria.funcionario(id_funcionario),
foreign key (Idproduto) references cafeteria.produtos(codigo));

create table if not exists funcionario(
id_funcionario int not null auto_increment,
idvendas int not null,
data_nascimento date,
nome varchar(100) not null,
telefone varchar(100) not null,
primary key (id_funcionario));

create table if not exists produtos(
codigo int not null auto_increment,
data_vencimento date,
descricao varchar(100) not null,
categoria varchar(100) not null,
valor decimal (11,2) not null,
primary key (codigo));

create table if not exists usuario(
    id_section int not null auto_increment,
    nome varchar(100) not null,
    senha varchar(100) not null,
    primary key(id_section));




