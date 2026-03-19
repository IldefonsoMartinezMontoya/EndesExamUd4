package Modelo;

public class Circulo implements opraciones {

    private double radio;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double calcularArea() {
        return 3.1416 * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * 3.1416 * radio;
    }

    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            this.radio = radio;
        }
    }
}