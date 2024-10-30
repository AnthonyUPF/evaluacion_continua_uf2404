package lab.juego.clases;

import java.util.Scanner;

public class Juego {
    private Jugador jugador;
    private Adivinador adivinador;

    public void iniciarJuego() {
        // Usamos try-with-resources para cerrar el Scanner automáticamente
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce tu nombre: ");
            String nombre = scanner.nextLine();
            jugador = new Jugador(nombre, 5); // El jugador tiene 5 intentos
            adivinador = new Adivinador();

            System.out.println("¡Bienvenido, " + jugador.getNombre() + "! " +
                    "Tienes " + jugador.getIntentosRestantes() + " intentos para adivinar el número entre 1 y 100.");

            while (jugador.getIntentosRestantes() > 0) {
                System.out.print("Introduce tu intento: ");
                
                // Comprobamos si la entrada es un número entero
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, introduce un número válido.");
                    scanner.next(); // Limpiar la entrada no válida
                }
                
                int intento = scanner.nextInt();
                String pista = adivinador.darPista(intento);

                if (pista.equals("¡Correcto!")) {
                    System.out.println("¡Felicidades, " + jugador.getNombre() + "! Has adivinado el número.");
                    return;
                } else {
                    System.out.println(pista);
                    jugador.perderIntento();
                    if (jugador.getIntentosRestantes() > 0) {
                        System.out.println("Te quedan " + jugador.getIntentosRestantes() + " intentos.");
                    } else {
                        System.out.println("Lo siento, " + jugador.getNombre() + ". Has agotado tus intentos. " +
                                "El número secreto era " + adivinador.getNumeroSecreto() + ".");
                    }
                }
            }
        } // El Scanner se cierra automáticamente aquí
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego();
    }
}
