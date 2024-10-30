package mini_proyectos.clases;

public class Contador {
    private static int contadorInstancias = 0;

    public Contador() {
        contadorInstancias++;
    }

    public static int obtenerContadorInstancias() {
        return contadorInstancias;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println("Número de instancias creadas: " + Contador.obtenerContadorInstancias());
    }
}
