import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[6];
        double soma = 0;

        // leitura dos números
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        // soma dos valores
        for (int i = 0; i < 6; i++) {
            soma += numeros[i];
        }

        double media = soma / 6;

        System.out.println("Media: " + media);

        sc.close();
    }
}