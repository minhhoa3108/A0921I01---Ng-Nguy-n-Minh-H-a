select * from users;



-- Ham tim kiem user theo id
DELIMITER $$
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
	SELECT users.name, users.email, users.country
    FROM users
    WHERE users_id = user_id;
END$$
DELIMITER ;

-- Ham them moi User
DELIMITER $$
CREATE PROCEDURE insert_user(
	IN user_name varchar(50),
	IN user_email varchar(50),
	IN user_country varchar(50)
	)
BEGIN
	INSERT INTO users(name, email, country) VALUES (user_name, user_email, user_country);
END $$
DELIMITER ;

-- Ham Sap xep theo ten
DELIMITER $$
CREATE PROCEDURE sortName()
BEGIN 
	select * from users ORDER BY users.name;
END $$
DELIMITER ;
CALL sortName();

-- Ham hien thi Danh Sach User
DELIMITER $$
CREATE PROCEDURE displayAllUser()
BEGIN
	select * from users;
END $$
DELIMITER ;
CALL displayAllUser();

-- Ham Xoa User bang Store Procedure
DELIMITER $$
CREATE PROCEDURE deleteUserStore(IN user_id int)
BEGIN
	DELETE FROM users WHERE users.id = user_id;
END $$
DELIMITER ;

create table Permision(
	id int(11) primary key,
	name varchar(50)
);

create table User_Permision(
	permision_id int(11),
	user_id int(11)
);

insert into Permision(id, name) values(1, 'add');
insert into Permision(id, name) values(2, 'edit');
insert into Permision(id, name) values(3, 'delete');
insert into Permision(id, name) values(4, 'view');