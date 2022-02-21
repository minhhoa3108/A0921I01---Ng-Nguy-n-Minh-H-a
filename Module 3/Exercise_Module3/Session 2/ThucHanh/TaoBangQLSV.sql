create database QuanLySinhVien;
use QuanLySinhVien;

create table Class(
	Class_ID int not null primary key auto_increment,
    Class_name varchar(60) not null,
    StartDate datetime not null,
    `Status` Bit
);

create table Student(
	Student_ID int not null primary key auto_increment,
    Student_name varchar(30) not null,
    Address varchar(50),
    Phone varchar(10),
    `Status` Bit,
    Class_ID int not null,
    foreign key (Class_ID) references Class(Class_ID)
);

create table `Subject`(
	Sub_ID int not null primary key auto_increment,
    Sub_name varchar(30),
    Credit Tinyint not null default '1' check (Credit >= 1),
    `Status` bit
);

Alter Table `Subject`
Alter `Status` SET default '1';

create table Mark(
	Mark_ID int not null primary key auto_increment,
    Sub_ID int not null unique,
    Student_ID int not null unique,
    Mark float default '0',
    check(0<= Mark <= 100),
    Examtimes tinyint default '1',
    foreign key (Sub_ID) references `Subject`(Sub_ID),
    foreign key (Student_ID) references Student(Student_ID)
);