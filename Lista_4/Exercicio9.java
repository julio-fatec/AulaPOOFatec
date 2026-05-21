import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // leitura
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // ordenação (bubble sort)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {

                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }

            }
        }

        // exibição
        System.out.println("\nArray ordenado:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}