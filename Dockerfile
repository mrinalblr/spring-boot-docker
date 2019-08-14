FROM openjdk:8
ADD target/spring-boot-docker-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]