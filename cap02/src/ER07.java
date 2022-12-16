//Código em correção
import java.util.InputMismatchException;
import java.util.Scanner;
public class ER07 {
    public static void main(String[] args) {
        int x = 0;
        int soma = 0;
        int quantidade = 0;
        int i = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Entre com a quantidade de valores.");
        quantidade = s.nextInt();
        s.nextLine();

        while (i < quantidade) {
            System.out.println("Entre o valor " + (i + 1) + ": ");
            try {
                x = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Não é um número");
                continue;
            } finally {
                System.out.println("Entre o valor " + (i + 1) + ": ");
                x = s.nextInt();
            }
            i++;
            soma += x;
        }
        System.out.println("A soma é: " + soma);
        s.close();
    }
}
