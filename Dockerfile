FROM eclipse-temurin:21-jre

WORKDIR /app

COPY TankServer.jar app.jar

CMD ["java", "-jar", "app.jar"]
