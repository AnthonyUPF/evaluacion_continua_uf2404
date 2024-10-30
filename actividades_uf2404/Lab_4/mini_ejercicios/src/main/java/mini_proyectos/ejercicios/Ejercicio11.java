package mini_proyectos.ejercicios;

import mini_proyectos.clases.Circulo;
import mini_proyectos.clases.ConstantesMatematicas;
import mini_proyectos.clases.Contador;
import mini_proyectos.clases.Figura;
import mini_proyectos.clases.Rectangulo;


public class Ejercicio11 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Uso de final:");
        System.out.println("Valor de PI: " + ConstantesMatematicas.PI);

        System.out.println("\nUso de static:");
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        System.out.println("Número de instancias creadas: " + Contador.obtenerContadorInstancias());

        System.out.println("\nUso de abstract:");
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
