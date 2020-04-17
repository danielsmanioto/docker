create table users (
	id INT primary key,
 	user_address_id INT not null,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	ip_address VARCHAR(20),
	password VARCHAR(50)
);


