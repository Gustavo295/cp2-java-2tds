# Etapa 1: Build manual com OpenJDK 18 + Gradle instalado manualmente
FROM gradle:8.13-jdk17 as build

WORKDIR /home/app
COPY . .

# Faz o build do jar
RUN gradle bootJar --no-daemon

# Etapa 2: Runtime
FROM gradle:8.13-jdk17
WORKDIR /app
RUN adduser -D -g '' appuser

COPY --from=build /home/app/build/libs/*.jar app.jar

USER appuser

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
