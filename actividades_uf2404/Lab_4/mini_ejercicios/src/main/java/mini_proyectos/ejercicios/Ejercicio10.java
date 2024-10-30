package mini_proyectos.ejercicios;

import java.io.*;

class MiExcepcionPersonalizada extends Exception {
    public MiExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        try {
            // Ejemplo de manejo de errores de E/S
            BufferedReader reader = new BufferedReader(new FileReader("archivo_no_existe.txt"));
            reader.close();
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }

        try {
            // Dividir por cero
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }

        try {
            // Excepción personalizada
            lanzarExcepcionSiEsNulo(null);
        } catch (MiExcepcionPersonalizada e) {
            System.out.println("Error personalizado: " + e.getMessage());
        }
    }

    public static int dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        return a / b;
    }

    public static void lanzarExcepcionSiEsNulo(Object objeto) throws MiExcepcionPersonalizada {
        if (objeto == null) throw new MiExcepcionPersonalizada("Objeto no puede ser null");
    }
}
