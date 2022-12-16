public class ER08 {

    public static void main(String[] args) {
        Temperatura t = new Temperatura(20, 20, 20);
        System.out.println("Temperaturas atuais" + t);

        System.out.println(Temperatura.Fahrenheit(20.5));
        System.out.println(Temperatura.Celsius(0.5));
        System.out.println(Temperatura.Kelvin(100.5));
    }
}
