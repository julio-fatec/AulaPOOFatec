import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        boolean repetido = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {

                        if (i == k && j == l) {
                            continue;
                        }

                        if (matriz[i][j] == matriz[k][l]) {
                            repetido = true;
                        }

                    }
                }
            }
        }

        if (repetido) {
            System.out.println("Existem numeros repetidos.");
        } else {
            System.out.println("Nao ha numeros repetidos.");
        }

        sc.close();
    }
}
