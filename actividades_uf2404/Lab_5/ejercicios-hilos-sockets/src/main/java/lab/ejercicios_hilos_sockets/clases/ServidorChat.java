package lab.ejercicios_hilos_sockets.clases;

import java.io.*;
import java.net.*;

public class ServidorChat {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Servidor de chat esperando conexión en el puerto 1234...");

            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                System.out.println("Cliente conectado al chat. Escribe 'exit' para finalizar la conexión.");

                // Hilo para recibir mensajes del cliente
                Thread recibirMensajes = new Thread(() -> {
                    try {
                        String mensaje;
                        while ((mensaje = in.readLine()) != null) {
                            System.out.println("Cliente: " + mensaje);
                            if (mensaje.equalsIgnoreCase("exit")) {
                                System.out.println("Cliente ha finalizado la conexión.");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error al recibir mensaje del cliente.");
                    }
                });
                recibirMensajes.start();

                // Hilo para enviar mensajes al cliente
                BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
                String mensajeConsola;
                while ((mensajeConsola = consola.readLine()) != null) {
                    out.println(mensajeConsola);
                    if (mensajeConsola.equalsIgnoreCase("exit")) {
                        System.out.println("Cerrando conexión con el cliente...");
                        break;
                    }
                }

                recibirMensajes.join(); // Espera a que el hilo de recepción finalice

            } catch (Exception e) {
                System.out.println("Error en la conexión con el cliente.");
            }

        } catch (Exception e) {
            System.out.println("Error al iniciar el servidor de chat.");
        }
    }
}
