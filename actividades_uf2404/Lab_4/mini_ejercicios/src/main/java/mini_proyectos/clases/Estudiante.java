package mini_proyectos.clases;

public class Estudiante extends Persona {
    private String grado;
    private String especializacion;

    public Estudiante(String nombre, int edad, String grado, String especializacion) {
        super(nombre, edad);
        this.grado = grado;
        this.especializacion = especializacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Grado: " + grado + ", Especialización: " + especializacion);
    }
}
