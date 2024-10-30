package lab_3.ejercicios;

import java.io.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        String contenido = "Este es un archivo de prueba";
        String nombreArchivo = "datos.txt";
        
        // Imprimir la ruta de trabajo actual
        System.out.println("Ruta de trabajo actual: " + new File(".").getAbsolutePath());

        // Crear y escribir en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
            System.out.println("Archivo creado y contenido escrito.");
        } catch (IOException e) {
            System.out.println("Error al crear o escribir en el archivo: " + e.getMessage());
        }

        // Leer del archivo
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
