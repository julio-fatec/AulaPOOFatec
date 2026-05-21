import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        // leitura
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // exibição invertida
        System.out.println("\nArray invertido:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}