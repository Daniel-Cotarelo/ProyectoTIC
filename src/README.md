# 🎮 Tetris Simplificado en Consola

### 👨‍💻 Autor: Daniel Cotarelo  
### 🗂️ Proyecto: Programación II – Juego en Java (POO) + Docker

---

## 📌 Descripción General

Este proyecto es una versión simplificada del clásico juego **Tetris**, diseñada para ejecutarse en consola. Implementa los fundamentos de **Programación Orientada a Objetos** utilizando Java y está contenida dentro de un entorno **Dockerizado**, lo que permite su ejecución sin necesidad de configurar nada en el equipo local.

---

## 🧠 Objetivo del Juego

- El jugador controla una **pieza que cae** desde la parte superior del tablero.
- Puede moverla **izquierda (a)**, **derecha (d)** o **hacia abajo (s)**.
- Si la pieza no puede bajar más, se **fija en el tablero**.
- Si se **completa una fila**, esta se **elimina** automáticamente.
- El juego termina cuando **no hay espacio para generar una nueva pieza**.

---

## 🧱 Estructura de Clases

```plaintext
Tetris/
├── App.java         → Clase principal que inicia el juego
├── Juego.java       → Controla la lógica principal del bucle del juego
├── Tablero.java     → Representa el tablero, contiene y gestiona las celdas
└── Pieza.java       → Representa la pieza en movimiento
