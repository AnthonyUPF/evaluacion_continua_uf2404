package lab.ejercicios_hilos_sockets.clases;

public class SumaHilo implements Runnable {
    private final int numero1;
    private final int numero2;
    private int resultado;

    public SumaHilo(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public void run() {
        resultado = numero1 + numero2;
        System.out.println("Suma de " + numero1 + " + " + numero2 + " = " + resultado);
    }
}
