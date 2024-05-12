FROM openjdk:17-jdk-alpine
LABEL authors="haris"
COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]