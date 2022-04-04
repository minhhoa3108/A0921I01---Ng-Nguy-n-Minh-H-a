create database furama_resort;
use furama_resort;

create table employees(
	id int(11) primary key,
    name varchar(50),
    birthday date,
    salary double,
    phone varchar(50),
    email varchar(50)
);