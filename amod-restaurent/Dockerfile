FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/restro.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","restro.jar"]