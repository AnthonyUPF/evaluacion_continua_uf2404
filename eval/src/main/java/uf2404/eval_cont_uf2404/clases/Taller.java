package uf2404.eval_cont_uf2404.clases;

import java.util.ArrayList;
import java.util.List;

public class Taller {
    private final String nombre;
    private List<Cliente> clientes;
    private List<Reparacion> reparaciones;

    public Taller(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.reparaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Reparacion> getReparaciones() {
        return reparaciones;
    }

    public void setReparaciones(List<Reparacion> reparaciones) {
        this.reparaciones = reparaciones;
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarReparacion(Reparacion reparacion) {
        reparaciones.add(reparacion);
    }

    public void listarReparaciones() {
        System.out.println("Reparaciones en " + nombre + ":");
        for (Reparacion r : reparaciones) {
            r.mostrarInfoReparacion();
        }
    }

    public static int contarReparaciones(Taller taller) {
        return taller.reparaciones.size();
    }
}
