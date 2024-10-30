package lab_3.ejercicios;

import lab_3.clases.Persona;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        @SuppressWarnings("unused")
        Persona persona = new Persona();

        // Se establece la referencia a null
        persona = null; 

        // Invocar al Garbage Collector (no garantizado que se ejecute inmediatamente)
        System.gc(); 

        // Mensaje al final del programa
        System.out.println("Fin del programa");
    }
}
