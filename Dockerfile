# Etapa 1: Build manual com OpenJDK 18 + Gradle instalado manualmente
FROM gradle:8.7-jdk-alpine as build

WORKDIR /home/app
COPY . .

# Faz o build do jar
RUN gradle bootJar --no-daemon

# Etapa 2: Runtime
FROM gradle:8.7-jdk-alpine
WORKDIR /app

COPY --from=build /home/app/build/libs/*.jar app.jar

RUN useradd -m appuser
USER appuser

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
