import java.util.Scanner;

public class ER03 {

    public static void main(String[] args) {
        //Programa lê 2 valores, um inteiro e outro decimal e imprime os valores

        //valores inteiros: byte, short, int, long
        //valores reais: float, double
        //valores caracteres: char
        //valores lógicos: boolean

        Scanner s = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro");
        int x = s.nextInt();

        s.nextLine();

        System.out.println("Entre com um valor real");
        float y = s.nextFloat();

        s.nextLine();

        System.out.println("Entre com outro valor real");
        double z = s.nextDouble();



        System.out.println(x + ", " + y + " e " + z);

        s.close();

    }

}