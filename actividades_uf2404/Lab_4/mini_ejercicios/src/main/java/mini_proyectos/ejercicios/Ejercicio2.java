package mini_proyectos.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Declaración e impresión de variables
        int numeroEntero = 5;
        double numeroDecimal = 10.5;
        String texto = "Hola Java";
        System.out.println("Número Entero: " + numeroEntero);
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("Texto: " + texto);

        // Conversión entre tipos de datos
        double conversion = (double) numeroEntero;
        System.out.println("Conversión a double: " + conversion);

        // Calcular el área de un rectángulo
        double lado1 = 5.5;
        double lado2 = 3.0;
        double area = lado1 * lado2;
        System.out.println("Área del rectángulo: " + area);

        // Conversión de Fahrenheit a Celsius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);

        System.out.print("Ingrese grados Celsius: ");
        celsius = scanner.nextDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
