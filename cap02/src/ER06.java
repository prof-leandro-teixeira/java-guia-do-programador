import java.util.Scanner;
public class ER06 {
    public static void main(String[] args) {
        // Programa informa área e perímetro de um quadrilátero

        Scanner s = new Scanner(System.in);

        System.out.println("você vai descobrir a área e o perímetro de um terreno retangular.");

        System.out.println("Entre com a largura: ");
        double l = s.nextDouble();
        s.nextLine();

        System.out.println("Entre com o comprimento: ");
        double c = s.nextDouble();

        System.out.println("O perímetro é " + ((2 * l) + (2 * c)) + " e a área é " + l * c);
        s.close();
    }
}
