package lab_3.clases;

public class PersonaModificada {
    private String nombre;
    private int edad;

    public PersonaModificada(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
