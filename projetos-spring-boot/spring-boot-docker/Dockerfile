FROM openjdk

VOLUME /tmp
ADD /target/spring-boot-docker-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
RUN sh -c 'touch spring-boot-docker.jar'
ENTRYPOINT ["java", "-Djava-security.egd=file:/dev/random", "-jar", "spring-boot-docker.jar"]


