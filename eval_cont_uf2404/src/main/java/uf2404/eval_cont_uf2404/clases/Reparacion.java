package uf2404.eval_cont_uf2404.clases;

public class Reparacion {
    private final Vehiculo vehiculo;
    private String descripcion;
    private double costo;

    public Reparacion(String descripcion, double costo, String matricula, String marca, String modelo) {
        this.vehiculo = new Vehiculo(matricula, marca, modelo, null);
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void mostrarInfoReparacion() {
        System.out.println("Reparación: " + descripcion + ", Costo: $" + costo);
        vehiculo.mostrarInfoVehiculo();
    }
}
