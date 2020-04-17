create table user_address (
	id INT primary key,
	email VARCHAR(100),
        cep varchar(8),
        logradouro VARCHAR(50),
	complemento VARCHAR(50),
        uf VARCHAR(2),
        cidade VARCHAR(100)
);


