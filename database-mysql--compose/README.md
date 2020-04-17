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
docker exec -it database-mysql--compose_db_1 -uroot -p

[logs] 
docker logs database-mysql--compose_db_1
docker exec -it database-mysql--compose_db_1 bash

# referencias
https://docs.docker.com/compose/install/
https://docs.docker.com/compose/gettingstarted/

#remover stop

docker ps
dcker stop <id>
docker rm <id>
