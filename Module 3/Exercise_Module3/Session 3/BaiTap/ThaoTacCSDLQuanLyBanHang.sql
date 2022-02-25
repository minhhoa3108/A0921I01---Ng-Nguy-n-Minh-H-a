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

INSERT INTO Customer(Customer_ID, Customer_name, Customer_age) values (1, 'Minh Quan', 10);
INSERT INTO Customer(Customer_ID, Customer_name, Customer_age) values (2, 'Ngoc Oanh', 20);
INSERT INTO Customer(Customer_ID, Customer_name, Customer_age) values (3, 'Hong Ha', 50);

INSERT INTO `Order`(Order_ID, Order_date, Customer_ID) values (1, '2006-3-21', 1);
INSERT INTO `Order`(Order_ID, Order_date, Customer_ID) values (2, '2006-3-23', 2);
INSERT INTO `Order`(Order_ID, Order_date, Customer_ID) values (3, '2006-3-16', 1);

INSERT INTO Product(Product_ID, Product_name, Product_price) 
values(1, 'May Giat', 3);
INSERT INTO Product(Product_ID, Product_name, Product_price) 
values(2, 'Tu Lanh', 5);
INSERT INTO Product(Product_ID, Product_name, Product_price) 
values(3, 'Dieu Hoa', 7);
INSERT INTO Product(Product_ID, Product_name, Product_price) 
values(4, 'Quat', 1);
INSERT INTO Product(Product_ID, Product_name, Product_price) 
values(5, 'Bep Dien', 2);

INSERT INTO Order_Detail(Order_ID, Product_ID, Quantity)
values(1, 1, 3);
INSERT INTO Order_Detail(Order_ID, Product_ID, Quantity)
values(1, 3, 7);
INSERT INTO Order_Detail(Order_ID, Product_ID, Quantity)
values(1, 4, 2);
INSERT INTO Order_Detail(Order_ID, Product_ID, Quantity)
values(2, 1, 1);
INSERT INTO Order_Detail(Order_ID, Product_ID, Quantity)
values(3, 1, 8);
INSERT INTO Order_Detail(Order_ID, Product_ID, Quantity)
values(2, 5, 4);
INSERT INTO Order_Detail(Order_ID, Product_ID, Quantity)
values(2, 3, 3);

/*Truy vấn dữ liệu*/
/*1*/
select * from `Order`;

/*2*/
select Cus.Customer_name, Pro.Product_name from
(
(
(Order_Detail inner join `Order` Ord on Order_Detail.Order_ID = Ord.Order_ID) 
inner join Product Pro on Order_detail.Product_ID = Pro.Product_ID) 
inner join Customer Cus on Ord.Customer_ID = Cus.Customer_ID);

/*3*/

/*4*/
