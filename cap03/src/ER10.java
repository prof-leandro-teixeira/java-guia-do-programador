public class ER10 {
    public static void main(String[] args) {
        Retangulo sala1 = new Retangulo(2,4);
        Retangulo sala2 = new Retangulo(3,4);
        System.out.println("O total de área das salas é " + (sala1.area() + sala2.area()) + "m²");
    }
}
