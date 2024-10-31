package lab.ejercicios_hilos_sockets.clases;

import java.io.*;
import java.net.*;

public class ClienteChat {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader consola = new BufferedReader(new InputStreamReader(System.in))) {
            
            System.out.println("Conectado al servidor de chat. Escribe 'exit' para salir.");

            // Hilo para recibir mensajes del servidor
            Thread recibirMensajes = new Thread(() -> {
                try {
                    String mensaje;
                    while ((mensaje = in.readLine()) != null) {
                        System.out.println("Servidor: " + mensaje);
                        if (mensaje.equalsIgnoreCase("exit")) {
                            System.out.println("El servidor ha cerrado la conexión.");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error al recibir mensaje del servidor.");
                }
            });
            recibirMensajes.start();

            // Hilo para enviar mensajes al servidor
            String mensajeConsola;
            while ((mensajeConsola = consola.readLine()) != null) {
                out.println(mensajeConsola);
                if (mensajeConsola.equalsIgnoreCase("exit")) {
                    System.out.println("Cerrando conexión con el servidor...");
                    break;
                }
            }

            recibirMensajes.join(); // Espera a que el hilo de recepción finalice

        } catch (Exception e) {
            System.out.println("Error en la conexión con el servidor.");
        }
    }
}
