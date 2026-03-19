package controlador;

import Modelo.Circulo;
import Modelo.Rectangulo;
import Modelo.Triangulo;

import java.util.ArrayList;

public class GestorFiguras {
    //Eliminadas redundancias, convertidos varios if en un if-else if
    //Convertida la lista en private y final porque no se va a instanciar fuera
    private final ArrayList<Object> figuras;

    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Object f) {
        figuras.add(f);
    }

    public void mostrarAreas() {
        for (Object f : figuras) {
            if (f instanceof Circulo c) {
                System.out.println("Area circulo: " + c.calcularArea());
            } else if (f instanceof Rectangulo r) {
                System.out.println("Area rectangulo: " + r.calcularArea());
            } else if (f instanceof Triangulo t) {
                System.out.println("Area triangulo: " + t.calcularArea());
            }
        }
    }

    public void mostrarPerimetros() {
        for (Object f : figuras) {
            if (f instanceof Circulo c) {
                System.out.println("Perimetro circulo: " + c.calcularPerimetro());
            } else if (f instanceof Rectangulo r) {
                System.out.println("Perimetro rectangulo: " + r.calcularPerimetro());
            } else if (f instanceof Triangulo t) {
                System.out.println("Perimetro triangulo: " + t.calcularPerimetro());
            }
        }
    }

    public void dibujarTodo() {
        for (Object f : figuras) {
            if (f instanceof Circulo) {
                ((Circulo) f).dibujar();
            } else if (f instanceof Rectangulo) {
                ((Rectangulo) f).dibujar();
            } else if (f instanceof Triangulo) {
                ((Triangulo) f).dibujar();
            }
        }
    }
}