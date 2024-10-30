package mini_proyectos.clases;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return ConstantesMatematicas.PI * radio * radio;
    }
}
