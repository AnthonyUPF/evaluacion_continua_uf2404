package mini_proyectos.ejercicios;

import mini_proyectos.clases.Animal;
import mini_proyectos.clases.Estudiante;
import mini_proyectos.clases.Gato;
import mini_proyectos.clases.Perro;

public class Ejercicio8 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos", 20, "Licenciatura", "Matemáticas");
        estudiante.imprimirDatos();

        Animal perro = new Perro();
        Animal gato = new Gato();
        perro.hacerSonido();
        gato.hacerSonido();
    }
}