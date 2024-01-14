FROM openjdk:17-jdk
COPY . .
RUN ./mvnw clean install
ENTRYPOINT [ "java", "-jar", "/target/todolist-0.0.1.jar" ]