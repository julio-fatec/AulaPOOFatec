import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        // leitura dos valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // soma dos valores
        for (int i = 0; i < 10; i++) {
            soma += numeros[i];
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}