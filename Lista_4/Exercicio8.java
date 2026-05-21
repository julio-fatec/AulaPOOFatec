import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // leitura do array
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // valor a buscar
        System.out.print("Digite o valor a contar: ");
        int x = sc.nextInt();

        int contador = 0;

        // contagem
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) {
                contador++;
            }
        }

        System.out.println("O valor aparece " + contador + " vez(es).");

        sc.close();
    }
}