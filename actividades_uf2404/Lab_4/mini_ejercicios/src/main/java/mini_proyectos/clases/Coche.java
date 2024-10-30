package mini_proyectos.clases;

import mini_proyectos.interfaces.Vehiculo;

public class Coche implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El coche está frenando");
    }
}
