import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;

        // leitura dos números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // contagem de pares
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de numeros pares: " + pares);

        sc.close();
    }
}
