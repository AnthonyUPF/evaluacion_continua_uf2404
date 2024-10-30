package mini_proyectos.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Operaciones básicas
        System.out.print("Ingrese primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));
        
        // Potencia
        double potencia = Math.pow(num1, num2);
        System.out.println("Potencia: " + potencia);

        // Calculadora de promedio
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese número " + (i+1) + ": ");
            suma += scanner.nextDouble();
        }
        System.out.println("Promedio: " + (suma / 5));

        scanner.close();
    }
}
