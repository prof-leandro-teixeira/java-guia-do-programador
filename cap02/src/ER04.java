import java.util.Scanner;
public class ER04 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro");
        int x = s.nextInt();

        for(int i=0; i <= x; i++) {
            System.out.print(i);
        }
        s.close();
    }
}
