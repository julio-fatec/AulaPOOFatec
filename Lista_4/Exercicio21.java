import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        char jogador = 'X';
        int linha, coluna;

        for (int i = 0; i < 9; i++) {

            for (int l = 0; l < 3; l++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print(tabuleiro[l][c] + " ");
                }
                System.out.println();
            }

            System.out.println("Jogador " + jogador);

            System.out.print("Linha (0-2): ");
            linha = sc.nextInt();

            System.out.print("Coluna (0-2): ");
            coluna = sc.nextInt();

            if (tabuleiro[linha][coluna] == '\u0000') {
                tabuleiro[linha][coluna] = jogador;

                if (jogador == 'X') {
                    jogador = 'O';
                } else {
                    jogador = 'X';
                }

            } else {
                System.out.println("Posicao ocupada!");
                i--;
            }
        }

        System.out.println("Fim de jogo");

        sc.close();
    }
}