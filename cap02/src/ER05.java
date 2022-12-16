import java.util.Scanner;
public class ER05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int x = s.nextInt();
        System.out.println("O número " + x + (x%2 == 0 ? " é par": " é ímpar"));
        s.close();
    }
}
