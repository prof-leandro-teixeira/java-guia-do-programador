import java.util.Scanner;

public class ER10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com valor menor do que 10: ");
        int x = s.nextInt();
        switch (x) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("sete");
                break;
            case 8:
                System.out.println("oito");
                break;
            case 9:
                System.out.println("nove");
                break;
            default:
                System.out.println("Valor não implementado");
                break;
        }
        s.close();
    }
}