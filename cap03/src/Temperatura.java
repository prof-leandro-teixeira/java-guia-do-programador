public class Temperatura {

    double c;
    double f;
    double k;

    public Temperatura() {
    }

    public Temperatura(double c, double f, double k) {
        this.c = c;
        this.f = f;
        this.k = k;
    }

    public static String Fahrenheit(double c) {
        Double f = 9*c/5+32;
        return "A conversão de " +c+ "° Celsius para Fahrenheit é " +f+ ".";
    }

    public static String Celsius(double f) {
        double c = (f-32)/9*5;
        return "A conversão de " +f+ "F é " +c+ "° Celsius.";
    }

    public static String Kelvin(double c) {
        double k = c+273+15;
        return "A conversão de " +c+ "° Celsius para Kelvin é " +k+ ".";
    }

    @Override
    public String toString() {
        return "Temperatura [c=" + c + ", f=" + f + ", k=" + k + "]";
    }


}
