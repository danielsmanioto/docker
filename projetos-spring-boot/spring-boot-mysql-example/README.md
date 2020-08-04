# Spring Boot MySQL Example

docker run --name=springboot_mysql_example --env="MYSQL_ROOT_PASSWORD=123daniel" mysql
<br>
docker inspect springboot_mysql_example
<br>
conectar no ip <IPAddress>
<br>
mvn spring-boot:run

# pre requisitos

### Instalar o cliente na maquina 
sudo apt-get install mysql-client 
<br>
pre configurar o mysql banco par a aplicaçãop acessar.

#Conectar no banco de dados via terminal
mysql -h 172.17.0.2 -u root -p
show databases;<br>
use springboot_mysql_example;<br>
show tables;<br>