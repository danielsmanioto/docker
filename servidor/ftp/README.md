# Dados de conexão - via filezila ou outro client fto
host: 127.0.0.1
post: 21
username: daniel
password: daniel

pasta padrão: /home/daniel-note/Downloads/arquivos 

# Start / Stop

`./run.sh`

`./stop.sh`

# Acessando container docker

`docker ps`
`docker exec -it vsftpd bin/sh` 
`cd /home/vsftpd/daniel` (Acessando pasta do 'repositorio' FTP)

# References

https://hub.docker.com/r/fauria/vsftpd/
https://github.com/fauria/docker-vsftpd
https://medium.com/ekode/criando-um-servidor-de-ftp-com-o-docker-34f109709109
