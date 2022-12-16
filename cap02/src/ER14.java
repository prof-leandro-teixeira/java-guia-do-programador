public class ER14 {
    public static void main(String[] args) {
        // Programa soma valores com uma entrada x
        //1- 1/2 + 1/3 -1/4 ....1/n
        //série na pagina 666 SÉRIES ALTERNADAS calculo 2 ANTON, BIVENS, DAVIS

        int i = 1;
        double denominador = 9999999;
        double somaNegativos = 0;
        double somaPositivos = 1;
        double total = 0;

        while(denominador>1) {
            if(denominador%2==0) {
                somaNegativos += (1/denominador);
                //System.out.printf("Entrada %d (Negativo) = -%.3f \n", i, somaNegativos);
            }else {
                somaPositivos += (1/denominador);
                //System.out.printf("Entrada %d (Positivo) =  %.3f\n", i,somaPositivos);
            }
            i++;
            denominador--;
        }
        total = somaPositivos - somaNegativos;

        System.out.printf("Somatório dos positivos =  %.2f\n",somaPositivos);
        System.out.printf("Somatório dos negativos = -%.2f\n",somaNegativos);
        System.out.printf("Somatório = %.3f",total);
    }
}