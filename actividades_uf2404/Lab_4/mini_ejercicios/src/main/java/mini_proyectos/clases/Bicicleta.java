package mini_proyectos.clases;

import mini_proyectos.interfaces.Vehiculo;

public class Bicicleta implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("La bicicleta está acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta está frenando");
    }
}

