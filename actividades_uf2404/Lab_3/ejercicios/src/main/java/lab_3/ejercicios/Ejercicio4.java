package lab_3.ejercicios;

import lab_3.clases.Coche;

public class Ejercicio4 {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2020);
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Año: " + coche.getAño());
    }
}
