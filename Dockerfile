FROM eclipse-temurin:17-jre-jammy
COPY target/* /app
WORKDIR /app
COPY src/main/resources/static ./src/main/resources/static
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]