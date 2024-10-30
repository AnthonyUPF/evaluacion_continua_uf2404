package lab.juego.clases;

import java.util.Random;

public class Adivinador {
    private int numeroSecreto;

    public Adivinador() {
        Random random = new Random();
        this.numeroSecreto = random.nextInt(100) + 1; // Genera un número entre 1 y 100
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public String darPista(int intento) {
        if (intento < numeroSecreto) {
            return "El número es mayor.";
        } else if (intento > numeroSecreto) {
            return "El número es menor.";
        }
        return "¡Correcto!";
    }
}
