import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        // leitura dos números
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // inicializa maior e menor
        int maior = numeros[0];
        int menor = numeros[0];

        // percorre o array
        for (int i = 1; i < 8; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}