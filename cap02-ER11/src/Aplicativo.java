//Adaptação do exercício de revisão 11 do capítulo 2
import java.util.Scanner;

public class Aplicativo {

    public static void main(String[] args) {
        // Programa lê índices pluviométricos, calcula a média e informa a data do maior índice
        Scanner s = new Scanner(System.in);

        //Apresentação
        System.out.println("\u001B[34mEste sistema fornecerá dados baseados em índices pluviométricos.\n"
                + "================================================================"
                + "\nO usuário deverá informar a quantidade de registros onde cada registro\n"
                + "será composto por data e a quantidade de chuva em mm do dia referido.\n"
                + "O relatório será apresentado e as informações serão disponibilizadas em seguida.\n"
                + "________________________________________________________________\u001B[0m");
        System.out.println("\nEntre com a quantidade de índices:");
        int n = s.nextInt();
        ControlePluviometrico[] registro = new ControlePluviometrico[n];

        //Leitura de dados
        for (int i = 0; i < n; i++) {
            s.nextLine();
            System.out.println("Entre a data");
            String data = s.nextLine();
            System.out.println("Entre a quantidade");
            double quantidade = s.nextDouble();
            registro[i] = new ControlePluviometrico(data,quantidade);
        }
        //Relatório dos dados digitados pelo usuário
        System.out.println("\nRelarório dos índices pluviométricos:");
        System.out.println("________________________");
        System.out.println("\n|   DATA     |   ÍNDICE |");
        for (int i = 0; i < registro.length; i++) {
            System.out.println("|" + registro[i].getData() + "  -     " + registro[i].getQuantidade()+" |");
        }
        System.out.println("________________________");
        //Cálculo do acumulado de chuva
        double acumulado = 0.0;
        for (int i = 0; i < registro.length; i++) {
            acumulado += registro[i].getQuantidade();
        }

        //Cálculo do dia de maior chuva
        int atual = 0;
        double maior = registro[0].getQuantidade();
        int dia = 0;
        for (int i = 1; i < registro.length; i++) {
            if (registro[i].getQuantidade() > maior)
                dia = i;
            maior = registro[dia].getQuantidade();

        }

        System.out.println("\u001B[34m\nO acumulado no período foi de: " + acumulado + " mm.\u001B[0m");
        System.out.println("\u001B[32mO média no período foi de: " + (acumulado / n) + " mm.\u001B[0m");
        System.out.println("\u001B[31mO maior índice no período foi de: " + maior + "mm no dia " + registro[dia].getData()+".");
        s.close();
    }
}

