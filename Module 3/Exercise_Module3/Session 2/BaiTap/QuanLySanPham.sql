create database QuanLySanPham;
use QuanLySanPham;

create table Customer(
	Customer_ID int not null primary key,
    Customer_name varchar(50) not null,
    Customer_age int,
    Customer_address varchar(100),
    Customer_phone int(10)
);

create table Product(
	Product_ID int not null primary key,
    Product_name varchar(50),
    Product_quantity int,
    Product_price int
);

create table `Order`(
	Order_ID int not null primary key,
    Order_date datetime,
    Total int,
    Customer_ID int,
    foreign key (Customer_ID) references Customer(Customer_ID)
);

create table Order_Detail(
	Order_ID int not null,
    Product_ID int,
    Quantity int,
    Sub_total int,
    primary key(Order_ID, Product_ID),
    foreign key (Order_ID) references `Order`(Order_ID),
    foreign key (Product_ID) references Product(Product_ID)
);

INSERT INTO Customer(Customer_ID, Customer_name, Customer_age) values (1, 'Minh Quan');