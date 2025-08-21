# Usa una imagen base de Java que incluya un JDK para construir la aplicación
FROM openjdk:17-jdk-slim as build

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos de Maven y el código fuente a la imagen
COPY pom.xml .
COPY src ./src

# Empaqueta la aplicación en un archivo JAR
RUN mvn clean package -DskipTests

# Usa una imagen base más ligera para la ejecución
FROM openjdk:17-jre-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR empaquetado desde la etapa de construcción
COPY --from=build /app/target/*.jar app.jar

# Define el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]