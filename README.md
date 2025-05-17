# Proyecto TIC: Evaluación Comparativa de Rendimiento entre Máquina Virtual y Docker

## Introducción

El presente proyecto tiene como objetivo analizar y comparar el rendimiento y el consumo de recursos de una aplicación Java cuando se ejecuta en dos entornos distintos: una máquina virtual con sistema operativo Ubuntu y un contenedor Docker. La aplicación utilizada para este estudio es un juego de Tetris desarrollado en Java, el cual implementa las funcionalidades esenciales del clásico juego de bloques, permitiendo al usuario interactuar con las piezas, desplazarlas y fijarlas dentro de un tablero.

Esta comparación permite evaluar las diferencias prácticas entre virtualización tradicional y contenedores en términos de eficiencia, uso de CPU, memoria y experiencia del usuario.

---

## Estructura del Proyecto

- `/docker` : Contiene el código fuente Java (`Tetris.java`) y el `Dockerfile` para construir la imagen.  
- `/docs` : Documentación adicional con resultados, análisis y guías de instalación.  
- `README.md` : Descripción general y guía de uso.

---

## Escenario Máquina Virtual (Ubuntu)

Se configuró una máquina virtual con Ubuntu instalada mediante VirtualBox, donde se instaló Java y Git para ejecutar el juego. En [`docs/vm-instrucciones.md`](./docs/vm-instrucciones.md) se detalla el proceso de configuración y uso.

---

## Escenario Docker

La aplicación Java se ejecuta dentro de un contenedor Docker basado en la imagen oficial `openjdk:21-slim`. El `Dockerfile` y el código `Tetris.java` están ubicados en la carpeta `/docker`. Instrucciones para construir y ejecutar el contenedor:

```bash
cd docker
docker build -t tetris-java:1.0 .
docker run -it --rm tetris-java:1.0
