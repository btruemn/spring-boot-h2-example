FROM openjdk:17-jre-slim
COPY target/your-app.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
