FROM eclipse-temurin:21-jdk

EXPOSE 8080

COPY ./target/ejemplo-springboot-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "ejemplo-springboot-0.0.1-SNAPSHOT.jar"]