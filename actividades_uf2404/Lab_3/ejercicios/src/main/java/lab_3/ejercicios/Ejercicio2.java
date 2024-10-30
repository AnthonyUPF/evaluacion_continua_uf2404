package lab_3.ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Valores del array:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        System.out.println("Valores del array bidimensional:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
