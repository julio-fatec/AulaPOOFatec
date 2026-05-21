import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // leitura do array
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // valor a buscar
        System.out.print("Digite o valor a buscar: ");
        int x = sc.nextInt();

        boolean encontrado = false;

        // busca
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) {
                encontrado = true;
            }
        }

        // resultado
        if (encontrado) {
            System.out.println("Valor encontrado no array.");
        } else {
            System.out.println("Valor nao encontrado.");
        }

        sc.close();
    }
}