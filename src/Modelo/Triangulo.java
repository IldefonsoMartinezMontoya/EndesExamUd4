package Modelo;

public class Triangulo implements opraciones {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double l1, double l2, double l3) {
        setBase(base);
        setAltura(altura);
        setLado1(l1);
        setLado2(l2);
        setLado3(l3);
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("No puede ser menor de cero");
        } else {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("No puede ser menor de cero");
        } else {
            this.altura = altura;
        }
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 < 0) {
            throw new IllegalArgumentException("No puede ser menor de cero");
        } else {
            this.lado1 = lado1;
        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 < 0) {
            throw new IllegalArgumentException("No puede ser menor que cero");
        } else {
            this.lado2 = lado2;
        }
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if (lado3 < 0) {
            throw new IllegalArgumentException("No puede ser menor que cero");
        } else {
            this.lado3 = lado3;
        }
    }
}