package mini_proyectos.ejercicios;

import mini_proyectos.clases.Bicicleta;
import mini_proyectos.clases.Coche;
import mini_proyectos.interfaces.Vehiculo;

public class Ejercicio9 {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        Vehiculo bicicleta = new Bicicleta();

        ejecutarAcciones(coche);
        ejecutarAcciones(bicicleta);
    }

    public static void ejecutarAcciones(Vehiculo vehiculo) {
        vehiculo.acelerar();
        vehiculo.frenar();
    }
}
