FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD spring-boot-basic-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-XX:+UseG1GC -Xmx:256m -Xms:256m -Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]