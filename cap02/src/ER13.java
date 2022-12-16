import java.util.Scanner;
public class ER13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com um número para cálculo do fatorial: ");

        int n = s.nextInt();
        System.out.print("Fatorial de " + n + " é ");

        int fatorial = 1;
        while (n > 0) {
            fatorial *= n;
            n--;
        }
        System.out.print(fatorial +".");
        s.close();
    }
}