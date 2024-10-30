package lab_3.clases;

public class Persona {
    public Persona() {
        System.out.println("Objeto creado");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Recolección de basura");
    }
}
