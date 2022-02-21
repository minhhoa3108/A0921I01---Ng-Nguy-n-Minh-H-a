create database QuanLyDiemThi;
use QuanLyDiemThi;

create table HocSinh(
	MaHS int primary key not null unique,
    TenHS varchar(50),
    NgaySinh date,
    Lop varchar(10),
    GT varchar(20)
);

create table GiaoVien(
	MaGV int primary key not null unique,
    TenGV varchar(50),
    SDT varchar(10)
);

create table MonHoc(
	MaMH int primary key not null unique,
    TenMH varchar(50),
    MaGV int,
    foreign key (MaGV) references GiaoVien(MaGV)
);

create table BangDiem(
	MaHS int not null,
    MaMH int not null,
    DiemThi float,
    NgayKT date,
    PRIMARY KEY (MaHS, MaMH),
    foreign key (MaHS) references HocSinh(MaHS),
    foreign key (MaMH) references MonHoc(MaMH)
);