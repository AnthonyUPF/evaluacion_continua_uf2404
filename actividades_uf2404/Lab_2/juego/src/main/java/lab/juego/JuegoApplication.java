package lab.juego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lab.juego.clases.Juego;

@SpringBootApplication
public class JuegoApplication {
    public static void main(String[] args) {
       
        // Iniciar la aplicación Spring
        SpringApplication.run(JuegoApplication.class, args);
        
        // Iniciar el juego
        Juego juego = new Juego();
        juego.iniciarJuego();
    }
}
