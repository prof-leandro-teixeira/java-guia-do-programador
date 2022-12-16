public class Ponto3D {
    double x;
    double y;
    double z;
    double fator;


    public Ponto3D() {
        x = 0;
        y = 0;
        z = 0;
        fator = 0;
    }

    public Ponto3D(double px, double py, double pz) {
        this.x = px;
        this.y = py;
        this.z = pz;
    }

    public String translado(double fator) {
        return "[" + x * fator + ", " + y * fator + ", " + z * fator + "]";
    }

    public double distanciaDeUmPonto(double px, double py, double pz) {
        return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2) + Math.pow(z - pz, 2));
    }

    public double distanciaDoPonto(Ponto3D p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) + Math.pow(z - p.z, 2));
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }

}