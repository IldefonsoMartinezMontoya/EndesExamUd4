public class Rectangulo implements opraciones{

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
       setAncho(ancho);
       setAlto(alto);
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * ancho + 2 * alto;
    }

    public void dibujar() {
        System.out.println("Dibujando rectangulo " + ancho + "x" + alto);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho < 0) {
            throw new IllegalArgumentException("No puede ser menor que cero");
        } else {
            this.ancho = ancho;
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto < 0) {
            throw new IllegalArgumentException("No puede ser menor que cero");
        } else {
            this.alto = alto;
        }
    }
}