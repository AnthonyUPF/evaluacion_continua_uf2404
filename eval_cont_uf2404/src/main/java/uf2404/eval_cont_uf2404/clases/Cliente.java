package uf2404.eval_cont_uf2404.clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Vehiculo> vehiculos;

    public Cliente(String nombre, String telefono) {
        super(nombre, telefono);
        this.vehiculos = new ArrayList<>();
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + ", Teléfono: " + telefono);
        System.out.println("Vehículos:");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfoVehiculo();
        }
    }
}
