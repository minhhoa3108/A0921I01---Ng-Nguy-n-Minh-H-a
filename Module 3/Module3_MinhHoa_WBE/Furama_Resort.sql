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
create table employees(
	id int primary key,
    name varchar(50),
    birthday varchar(50),
    salary double,
    phone varchar(50),
    email varchar(50)
);

select * from employees;

insert into employees(id, name, birthday, salary, phone, email)
values (1, 'Minh Hoa', '08-31-2002', 2000, '0931982199', 'minhhoa@gmail.com');

UPDATE employees 
SET employees.name = 'minh hoa1', employees.birthday = '', employees.salary = 1500,
	employees.phone = '', employees.email = ''
WHERE employees.id = 1;

DELIMITER $$
CREATE PROCEDURE editEmployee(
	IN employee_id int,
    IN employee_name varchar(50),
    IN employee_birthday varchar(50),
    IN employee_salary int,
    IN employee_phone varchar(50),
    IN employee_email varchar(50)
)
BEGIN
	UPDATE employees 
	SET employees.name = employee_name, employees.birthday = employee_birthday, employees.salary = employee_salary,
	employees.phone = employee_phone, employees.email = employee_email
	WHERE employees.id = employee_id;
END $$
DELIMITER ;


