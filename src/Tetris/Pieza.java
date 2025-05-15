package src.Tetris;

public class Pieza {
    private int fila;
    private int columna;

    public Pieza(int filaInicial, int columnaInicial) {
        fila = filaInicial;
        columna = columnaInicial;
    }

    public int obtenerFila() {
        return fila;
    }

    public int obtenerColumna() {
        return columna;
    }

    public void moverAbajo() {
        fila = fila + 1;
    }

    public void moverIzquierda() {
        columna = columna - 1;
    }

    public void moverDerecha() {
        columna = columna + 1;
    }
}
