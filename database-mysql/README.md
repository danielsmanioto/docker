# database-mysql

[Baixar imagem - sendo que latest é a tag da versão] 
docker pull mysql/mysql-server:latest

[Visualizar imagem baixada]
docker images

[run]
docker run --name=ds-mysql -d mysql/mysql-server:latest 

[Verificar se mysql esta iniciado]
docker ps

[Verificar se mysql nao esta iniciado]
docker ps --all

[Acessar via container]
docker logs ds-mysql 2>&1 | grep GENERATED
docker exec -it ds-mysql mysql -uroot -p

[dentro do container - alterar senha do banco de dados]
ALTER USER 'root'@'localhost' IDENTIFIED BY '321daniel';

[logs] 
docker logs ds-mysql
docker exec -it ds-mysql bash

# referencias

https://hub.docker.com/r/mysql/mysql-server/
