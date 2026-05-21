import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int pares = 0;

        // leitura da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // contagem de pares
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }

            }
        }

        System.out.println("Quantidade de numeros pares: " + pares);

        sc.close();
    }
}