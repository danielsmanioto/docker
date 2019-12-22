# database-mysql

[docker-compose.yml]
Conforme arquivo docker-compose.yml

[subir]
docker-compose up -d

[Visualizar imagem baixada]
docker images

[Verificar se mysql esta iniciado]
docker ps

[Verificar se mysql nao esta iniciado]
docker ps --all

[Acessar via container]
docker exec -it database-mysql_db_1 mysql -uroot -p

[logs] 
docker logs ds-mysql
docker exec -it database-mysql_db_1 bash

# referencias
https://docs.docker.com/compose/install/
https://docs.docker.com/compose/gettingstarted/
