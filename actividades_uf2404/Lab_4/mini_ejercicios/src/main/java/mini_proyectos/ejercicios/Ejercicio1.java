package mini_proyectos.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Parte 1: Saludo simple
        System.out.println("Hola, mundo");

        // Parte 2: Saludo personalizado
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

        // Parte 3: Pregunta sobre estado de ánimo
        System.out.print("¿Cómo estás? ");
        @SuppressWarnings("unused")
        String respuesta = scanner.nextLine();
        System.out.println("Entiendo, " + nombre);

        // Parte 4: Repetición del saludo
        int contador = 0;
        while (contador < 3) {
            System.out.println("¡Hola de nuevo, " + nombre + "!");
            contador++;
        }

        scanner.close();
    }
}
