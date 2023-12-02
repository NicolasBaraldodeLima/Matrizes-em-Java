package academy.devdojo.maratonajava.introducao;
import java.security.SecureRandom;


public class CursoJava {
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 4;
        int[][] numeros = new int[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                numeros[l][c] = new SecureRandom().nextInt(100);
            }

        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf("%d | ", numeros[l][c]);
            }

            System.out.printf("%n");


        }

    }

}



