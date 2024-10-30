package uf2404.eval_cont_uf2404.clases;

public abstract class Persona {
    protected final String nombre;
    protected final String telefono;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    // Método abstracto para mostrar la información de la persona
    public abstract void mostrarInfo();
}
