FROM openjdk:8-jdk-alpine
MAINTAINER "daijinming"<1055540431@qq.com>
ADD msa-api-hello-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
