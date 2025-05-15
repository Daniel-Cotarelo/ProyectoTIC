package src.Tetris;

import java.util.Scanner;

public class Juego {
    private Scanner entrada;
    private Tablero tablero;
    private Pieza piezaActual;
    private boolean juegoTerminado;

    public Juego() {
        entrada = new Scanner(System.in);
        tablero = new Tablero();
        juegoTerminado = false;
    }

    public void iniciar() {
        while (!juegoTerminado) {
            piezaActual = new Pieza(0, tablero.obtenerAncho() / 2);

            if (!tablero.posicionDisponible(piezaActual.obtenerFila(), piezaActual.obtenerColumna())) {
                tablero.mostrar();
                System.out.println("El tablero está lleno. Fin del juego.");
                juegoTerminado = true;
            } else {
                boolean piezaActiva;
                piezaActiva = true;

                while (piezaActiva) {
                    tablero.mostrarConPieza(piezaActual);
                    System.out.println("Mover (a: izquierda, d: derecha, s: abajo):");
                    String movimiento;
                    movimiento = entrada.nextLine();

                    if (movimiento.equals("a") && tablero.posicionDisponible(piezaActual.obtenerFila(),
                            piezaActual.obtenerColumna() - 1)) {
                        piezaActual.moverIzquierda();
                    } else if (movimiento.equals("d") && tablero.posicionDisponible(piezaActual.obtenerFila(),
                            piezaActual.obtenerColumna() + 1)) {
                        piezaActual.moverDerecha();
                    }

                    if (tablero.posicionDisponible(piezaActual.obtenerFila() + 1, piezaActual.obtenerColumna())) {
                        piezaActual.moverAbajo();
                    } else {
                        tablero.fijarPieza(piezaActual);
                        tablero.eliminarFilasCompletas();
                        piezaActiva = false;
                    }
                }
            }
        }

        entrada.close();
    }
}
