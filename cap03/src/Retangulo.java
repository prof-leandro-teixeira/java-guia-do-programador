public class Retangulo {

    private double b;
    private double h;

    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return b*h;
    }

    public double perimetro() {
        return 2*b + 2*h;
    }
}