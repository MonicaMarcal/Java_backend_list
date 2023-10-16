# Etapa de construção
FROM ubuntu:latest AS build

RUN apt-get update && apt-get install -y openjdk-17-jdk maven

WORKDIR /app

COPY . .

RUN mvn clean install

# Etapa final
FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /app/target/todo-do-list-1.0.0.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
