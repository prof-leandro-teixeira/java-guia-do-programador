import java.util.Scanner;
public class ER09 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        x = s.nextInt();
        System.out.println("Entre com o segundo número: ");
        y = s.nextInt();
        System.out.println("Entre com o terceiro número: ");
        z = s.nextInt();

        if (x > y && y > z) {
            System.out.println("O maior é " + x + ".");
        } else if (y > x && x > z) {
            System.out.println("O maior é " + y + ".");
        } else {
            System.out.println("O maior é " + z + ".");
        }
        s.close();
    }
}

