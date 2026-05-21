import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // leitura da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // exibicao da matriz
        System.out.println("\nMatriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}