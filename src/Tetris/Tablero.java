package src.Tetris;

public class Tablero {
    private char[][] celdas;
    private final int FILAS;
    private final int COLUMNAS;

    public Tablero() {
        FILAS = 10;
        COLUMNAS = 10;
        celdas = new char[FILAS][COLUMNAS];
        inicializar();
    }

    private void inicializar() {
        int fila;
        int columna;

        fila = 0;
        while (fila < FILAS) {
            columna = 0;
            while (columna < COLUMNAS) {
                celdas[fila][columna] = '.';
                columna = columna + 1;
            }
            fila = fila + 1;
        }
    }

    public void mostrar() {
        int fila;
        int columna;

        fila = 0;
        while (fila < FILAS) {
            columna = 0;
            while (columna < COLUMNAS) {
                System.out.print(celdas[fila][columna]);
                columna = columna + 1;
            }
            System.out.println();
            fila = fila + 1;
        }
        System.out.println();
    }

    public void mostrarConPieza(Pieza pieza) {
        int fila;
        int columna;

        fila = 0;
        while (fila < FILAS) {
            columna = 0;
            while (columna < COLUMNAS) {
                if (fila == pieza.obtenerFila() && columna == pieza.obtenerColumna()) {
                    System.out.print('O');
                } else {
                    System.out.print(celdas[fila][columna]);
                }
                columna = columna + 1;
            }
            System.out.println();
            fila = fila + 1;
        }
        System.out.println();
    }

    public boolean posicionDisponible(int fila, int columna) {
        if (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS) {
            if (celdas[fila][columna] == '.') {
                return true;
            }
        }
        return false;
    }

    public void fijarPieza(Pieza pieza) {
        int fila;
        int columna;

        fila = pieza.obtenerFila();
        columna = pieza.obtenerColumna();
        celdas[fila][columna] = 'O';
    }

    public void eliminarFilasCompletas() {
        int fila;
        int columna;
        boolean completa;
        int destino;

        fila = 0;
        while (fila < FILAS) {
            completa = true;
            columna = 0;

            while (columna < COLUMNAS) {
                if (celdas[fila][columna] == '.') {
                    completa = false;
                }
                columna = columna + 1;
            }

            if (completa) {
                destino = fila;
                while (destino > 0) {
                    columna = 0;
                    while (columna < COLUMNAS) {
                        celdas[destino][columna] = celdas[destino - 1][columna];
                        columna = columna + 1;
                    }
                    destino = destino - 1;
                }

                columna = 0;
                while (columna < COLUMNAS) {
                    celdas[0][columna] = '.';
                    columna = columna + 1;
                }
            }

            fila = fila + 1;
        }
    }

    public int obtenerAncho() {
        return COLUMNAS;
    }
}
