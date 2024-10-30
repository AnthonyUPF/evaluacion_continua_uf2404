package mini_proyectos.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Comparación de dos números
        System.out.print("Ingrese primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println(b + " es mayor que " + a);
        } else {
            System.out.println("Ambos números son iguales");
        }

        // Bucle `for` del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Cuenta regresiva con `while`
        int contador = 10;
        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }

        // Suma hasta el número ingresado con `do-while`
        System.out.print("Ingrese un número para sumar hasta él: ");
        int limite = scanner.nextInt();
        int suma = 0;
        int i = 1;
        do {
            suma += i;
            i++;
        } while (i <= limite);
        System.out.println("La suma es: " + suma);

        // Operaciones con `switch`
        System.out.print("Elija una operación (1: Suma, 2: Resta): ");
        int operacion = scanner.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("Resultado de la suma: " + (a + b));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + (a - b));
                break;
            default:
                System.out.println("Operación no válida");
        }

        scanner.close();
    }
}
