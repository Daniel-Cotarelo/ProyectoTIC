FROM openjdk:17-slim

WORKDIR /app

COPY src/ ./src/

RUN javac src/Tetris/*.java

CMD ["java", "-cp", "src", "Tetris.App"]
