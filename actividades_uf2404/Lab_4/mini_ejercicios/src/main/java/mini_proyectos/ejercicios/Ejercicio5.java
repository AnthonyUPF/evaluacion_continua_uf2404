package mini_proyectos.ejercicios;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Suma de valores en un array
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("Suma de valores: " + suma);

        // Impresión de array en orden inverso
        System.out.println("Array en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Encontrar el mayor número en el array
        int mayor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("Número mayor: " + mayor);

        // Comparación de dos arrays
        int[] otroArray = {1, 2, 3, 4, 5};
        boolean sonIguales = Arrays.equals(numeros, otroArray);
        System.out.println("¿Los arrays son iguales? " + sonIguales);
    }
}
