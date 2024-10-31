package lab.ejercicios_hilos_sockets.ejercicios;

import lab.ejercicios_hilos_sockets.clases.ClienteChat;
import lab.ejercicios_hilos_sockets.clases.ServidorChat;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4: Chat Cliente-Servidor en Consola");

        // Inicia el servidor de chat en un hilo separado
        new Thread(() -> {
            System.out.println("Iniciando el servidor de chat...");
            try {
                ServidorChat.main(null); // Ejecuta el servidor de chat
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // Pausa para asegurar que el servidor esté listo antes de iniciar el cliente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Iniciando el cliente de chat...");
        ClienteChat.main(null);
    }
}

