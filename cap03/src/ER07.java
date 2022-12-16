public class ER07 {
    public static void main(String[] args) {
        Ponto3D p0 = new Ponto3D();
        Ponto3D p = new Ponto3D(3, 4, 1.5);
        Ponto3D p2 = new Ponto3D(2, 3, 0.5);
        Double fator = 2.5;

        System.out.println("Este é o ponto: " + p0);

        System.out.println("\nPonto original:" + p.toString() + "\nFator: " + fator + "\nPonto com translado: " + p.translado(fator));
        System.out.println("\nDistância de um ponto original:" + p.distanciaDeUmPonto(3,4,1.5));
        System.out.println("\nDistância do ponto original:" + p.distanciaDoPonto(p2));
    }
}
