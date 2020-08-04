# Spring Boot and Docker

### docker build -t docker-spring .
### docker images
### docker run -p 8080:8080 -d docker-spring
### docker ps 
### docker stop docker-spring && docker rm docker-spring 

# dar uma limpa nos container ativos
docker stop $(docker ps --all -q) <br>
docker rm $(docker ps --all -q)

# Tecnologies
### JAVA8
### Maven

# Using
### http://localhost:8080/index
### http://localhost:8080/product/<id>
