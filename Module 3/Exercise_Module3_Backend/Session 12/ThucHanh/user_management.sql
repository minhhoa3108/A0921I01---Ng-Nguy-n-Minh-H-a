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


