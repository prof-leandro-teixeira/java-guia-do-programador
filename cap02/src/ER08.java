import java.util.Scanner;
public class ER08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = 0;
        double i = 0.5;
        double atual = 0;

        System.out.println("Quantidade de parcelas para pagamento:");
        System.out.print("Entre com o valor do montante: ");
        double m = s.nextDouble();

        System.out.print("Informe a entrada: ");
        double c = s.nextDouble();

        double juros = c * i;
        while (atual < m) {
            c += juros;
            atual = c;
            t += 1;
            System.out.println("Capital no mes " + t + " = " + c);
        }
        System.out.println("Quantidade de meses foi: " + t);
        s.close();
    }
}
