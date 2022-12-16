import java.util.Scanner;
public class ER11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//      Foi implementado com 2 entradas porém pode ser utilizada entrada do usuário
//		System.out.println("Entre com a quantidade de índices: ");
//		int quantidade = s.nextInt();

        String data[] = new String[2];
        int indice[] = new int[2];
        int i = 0;
        while (i < 2) {
            System.out.println("Entre com a data: ");
            data[i] = s.next();
            System.out.println("Entre com o índice em mm: ");
            indice[i] = s.nextInt();
            i++;
        }
        s.close();

        System.out.println("Relarório dos índices pluviométricos:");
        System.out.println("\n   DATA - ÍNDICE");
        for (i=0; i<data.length; i++){
            System.out.println(data[i] + " - " + indice[i] );
        }
        double acumulado = 0.0;
        for (i=0; i<data.length; i++){
            acumulado += indice[i];
        }
        System.out.println("O acumulado no período foi de: " + acumulado + " mm.");
        System.out.println("O média no período foi de: " + (acumulado/2) + " mm.");
    }
}