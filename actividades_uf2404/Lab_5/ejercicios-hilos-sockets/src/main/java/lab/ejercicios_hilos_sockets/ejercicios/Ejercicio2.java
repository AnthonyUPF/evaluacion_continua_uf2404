package lab.ejercicios_hilos_sockets.ejercicios;

import lab.ejercicios_hilos_sockets.clases.SumaHilo;

public class Ejercicio2 {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new SumaHilo(3, 5));
        Thread hilo2 = new Thread(new SumaHilo(10, 20));
        Thread hilo3 = new Thread(new SumaHilo(100, 200));

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
