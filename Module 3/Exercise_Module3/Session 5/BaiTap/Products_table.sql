create database  product_Session5;
use product_Session5;

create table products(
	id int not null primary key,
    productCode varchar(50),
    productName varchar(50),
    productPrice int,
    productAmount int,
    productDescription text,
    productStatus varchar(50)
);

insert into products(Id, productCode, productName, productPrice, productAmount, productDescription,
productStatus) values (1, 'pro1', 'orange', 25000, 100, 'Cam', 'còn hàng');
insert into products(Id, productCode, productName, productPrice, productAmount, productDescription,
productStatus) values (2, 'pro2', 'stawberry', 35000, 200, 'Dâu', 'còn hàng');
/*
insert into products(Id, productCode, productName, productPrice, productAmount, productDescription,
productStatus) values (3, 'pro3', 'banana', 20000, 200, 'Chuối', 'hết hàng');
insert into products(Id, productCode, productName, productPrice, productAmount, productDescription,
productStatus) values (4, 'pro4', 'watermelon', 50000, 50, 'dưa hấu', 'hết hàng');
insert into products(Id, productCode, productName, productPrice, productAmount, productDescription,
productStatus) values (5, 'pro5', 'lemon', 15000, 300, 'chanh', 'còn hàng');
*/

select * from products;
select productCode from products;
explain select productCode from products;
/*tạo unique index*/
create unique index uni_index_proCode on products (productCode);
select productCode from products;
explain select productCode from products;

/*composite index*/
create index idx_name_price on products(productName, productPrice);
select * from products;
explain select * from products;

/*Tạo view lấy về các thông tin:
productCode, productName, productPrice, productStatus từ bảng products.*/
create view view_product as
select productCode, productName, productPrice, productStatus from products;

select * from view_product;

update view_product set productName = "banana" where productCode = "pro2";

drop view view_product;

/*Tạo store procedure lấy tất cả thông tin 
của tất cả các sản phẩm trong bảng product*/
delimiter $$
create procedure display_all_product()
begin
	select * from products;
end $$
delimiter ;

call display_all_product();

/*Tạo store procedure thêm một sản phẩm mới*/
select * from products;

delimiter $$
create procedure add_product()
begin
	insert into products (id, productCode, productName, productPrice, productAmount, 
    productDescription, productStatus) values
    (3, "pro3", "watemelon", 30000, 150, "dưa hấu", "hết hàng");
end $$
delimiter ;

call add_product();

/*Tạo store procedure sửa thông tin sản phẩm theo id*/
delimiter $$
create procedure update_products_by_id()
begin
	update products set productPrice = 30000, productAmount = 20 where id = 1;
end $$
delimiter ;

call update_products_by_id();

/*Tạo store procedure xoá sản phẩm theo id*/
delimiter $$
create procedure delete_products_by_id()
begin
	delete from products where id = 3;
end $$
delimiter ;

call delete_products_by_id();