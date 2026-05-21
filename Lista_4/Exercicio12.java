import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        // leitura da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // soma dos elementos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}