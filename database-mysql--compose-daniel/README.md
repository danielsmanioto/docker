1) procurar no google stack yaml mysql
2) docker-compose -f stack.yml up
3) Ver logs

docker ps 
docker logs database-mysql--compose-daniel_adminer_1
docker logs database-mysql--compose-daniel_db_1

4) Acessar
http://localhost:8080

ou
docker exec -it database-mysql--compose-daniel_db_1 mysql -uroot -p


5) references  

Run docker stack deploy -c stack.yml mysql (or docker-compose -f stack.yml up), 
wait for it to initialize completely, and visit http://swarm-ip:8080, http://localhost:8080, or http://host-ip:8080 (as appropriate).

https://hub.docker.com/_/mysql

6) parar container
docker ps
doccker stop container_id
docker rm container_id


7) Info de como usar

Usamos o https://www.mockaroo.com/  para gerar os dados
basta criar o banco dsmanioto
basta importar o script 
e executar o app java com java 11

