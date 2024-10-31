package lab.ejercicios_hilos_sockets.clases;

import java.io.*;
import java.net.*;

public class ServidorSimple {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Servidor esperando conexión en el puerto 1234...");

            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                
                System.out.println("Cliente conectado. Esperando mensaje...");
                String mensaje = in.readLine();
                System.out.println("Mensaje recibido del cliente: " + mensaje);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

