FROM ubuntu:22.04 AS build

RUN apt-get update -y
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

ENTRYPOINT [ "java", "-jar", "/target/todolist-0.0.1.jar" ]