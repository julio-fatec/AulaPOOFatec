import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int x;
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o valor a buscar: ");
        x = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] == x) {
                    System.out.println("Encontrado na posicao [" + i + "][" + j + "]");
                    encontrado = true;
                }

            }
        }

        if (!encontrado) {
            System.out.println("Valor nao encontrado.");
        }

        sc.close();
    }
}
