package mini_proyectos.ejercicios;

import mini_proyectos.clases.Persona;

public class Ejercicio7 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25);
        Persona persona2 = new Persona("Luis", 30);

        persona1.imprimirDatos();
        System.out.println("¿Es mayor de edad? " + persona1.esMayorDeEdad());

        Persona mayor = Persona.compararEdad(persona1, persona2);
        System.out.println("Persona mayor es: " + mayor.getNombre());
    }
}

