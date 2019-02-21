#maven to build and package the jar
FROM maven:3.5-jdk-8-alpine AS build
WORKDIR /app
COPY . /app
RUN mvn clean package

#jdk to execute the jar
FROM openjdk:alpine
COPY --from=build /app/target/docker-springboot-rest-0.1.0.jar /app/docker-springboot-rest-0.1.0.jar
EXPOSE 5000

ENTRYPOINT ["java", "-jar", "/app/docker-springboot-rest-0.1.0.jar"]

