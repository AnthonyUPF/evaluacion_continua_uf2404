package lab.juego.clases;

public class Jugador {
    private String nombre;
    private int intentosRestantes;

    public Jugador(String nombre, int intentos) {
        this.nombre = nombre;
        this.intentosRestantes = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public void perderIntento() {
        this.intentosRestantes--;
    }
}
