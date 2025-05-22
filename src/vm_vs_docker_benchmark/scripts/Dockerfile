# Usar una imagen base de Java con JDK
FROM openjdk:17-slim

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo fuente Java al contenedor
COPY scripts/Tetris.java .

# Compilar el archivo Java
RUN javac Tetris.java

# Comando por defecto para ejecutar el juego
CMD ["java", "Tetris"]
