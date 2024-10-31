package lab.ejercicios_hilos_sockets.clases;

import java.io.*;
import java.net.*;

public class ClienteSimple {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234);
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {
            
            String mensaje = "¡Hola desde el cliente!";
            System.out.println("Enviando mensaje al servidor: " + mensaje);
            out.println(mensaje);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
