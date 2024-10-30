package mini_proyectos.ejercicios;

public class Ejercicio6 {
    
    // Método para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método para encontrar el elemento más grande en un array
    public static int encontrarMayor(int[] array) {
        int mayor = array[0];
        for (int num : array) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    // Método para verificar si un número es par o impar
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método para invertir una cadena
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método para eliminar vocales de un string
    public static String eliminarVocales(String cadena) {
        return cadena.replaceAll("[AEIOUaeiou]", "");
    }

    // Método static para calcular el factorial de un número
    public static int factorial(int numero) {
        if (numero == 0) return 1;
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Suma de 3 y 4: " + sumar(3, 4));
        System.out.println("Mayor en array: " + encontrarMayor(numeros));
        System.out.println("¿4 es par?: " + esPar(4));
        System.out.println("Cadena invertida: " + invertirCadena("Hola"));
        System.out.println("Sin vocales: " + eliminarVocales("Java es genial"));
        System.out.println("Factorial de 5: " + factorial(5));
    }
}
