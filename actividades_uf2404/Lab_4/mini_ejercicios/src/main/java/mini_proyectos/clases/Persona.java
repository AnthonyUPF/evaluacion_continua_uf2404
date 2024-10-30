package mini_proyectos.clases;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    // Método para imprimir datos de la persona
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método para comparar edades
    public static Persona compararEdad(Persona p1, Persona p2) {
        return (p1.getEdad() > p2.getEdad()) ? p1 : p2;
    }
}
