# Usa una imagen base de OpenJDK
FROM openjdk:21-jdk-slim AS build

# Define el directorio de trabajo
WORKDIR /app

# Copia el archivo pom.xml y el directorio de código fuente
COPY pom.xml .
COPY src ./src

# Compila el proyecto
RUN ./mvnw clean package -DskipTests

# Usa una imagen base de OpenJDK para la ejecución
FROM openjdk:21-jdk-slim

# Define el directorio de trabajo
WORKDIR /app

# Copia el archivo jar generado en la etapa de construcción
COPY --from=build /app/target/tp-arquiweb-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que la aplicación utilizará
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
