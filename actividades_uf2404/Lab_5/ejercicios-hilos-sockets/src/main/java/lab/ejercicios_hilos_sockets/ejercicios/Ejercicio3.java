package lab.ejercicios_hilos_sockets.ejercicios;

import lab.ejercicios_hilos_sockets.clases.ClienteSimple;
import lab.ejercicios_hilos_sockets.clases.ServidorSimple;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3: Cliente-Servidor de Mensajes");

        // Inicia el servidor en un hilo separado
        new Thread(() -> {
            System.out.println("Iniciando el servidor...");
            try {
                ServidorSimple.main(null); // Ejecuta el servidor
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // Pausa para asegurar que el servidor esté listo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Iniciando el cliente...");
        ClienteSimple.main(null);
    }
}
