package detyra2;

import java.util.Random;
import java.util.Scanner;

public class Detyra5 {
    public static void main(String[] args) {
        /* Të mbushet një matricë matrix[row][column] ku row dhe column merren si
           vlera nga shfrytëzuesi, dhe kjo matricë të mbushet me numra të
           rastësishëm nga 1 deri ne 10000.
           1. Të shtypen vlerat në diagonale te matricës
           2. Të shtypen vlerat në diagonale dhe poshtë diagonales/lart diagonales. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani numrin e rreshtave dhe kolonave te nje matrice katrore: ");
        int m_row_col = sc.nextInt();
        int[][] m = new int[m_row_col][m_row_col];
        Random random = new Random();
        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                m[i][j] = random.nextInt(10000) + 1;
            }
        }
        System.out.println("Matrica e gjeneruar eshte: ");
        System.out.println();

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                    System.out.printf("%7d", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Diagonalja kryesore e matrices: ");
        System.out.println();

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                if(i == j)
                    System.out.printf("%7d", m[i][j]);
                else
                    System.out.printf("%7s", " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Diagonalja nga ana tjeter e matrices: ");
        System.out.println();

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                if(i + j == m_row_col - 1)
                    System.out.printf("%7d", m[i][j]);
                else
                    System.out.printf("%7s", " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Vlerat në diagonalen kryesore dhe poshtë saj: ");
        System.out.println();

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                if(i >= j)
                    System.out.printf("%7d", m[i][j]);
                else
                    System.out.printf("%7s", " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Vlerat në diagonalen tjeter dhe poshtë saj: ");
        System.out.println();

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                if(i + j >= m_row_col - 1)
                    System.out.printf("%7d", m[i][j]);
                else
                    System.out.printf("%7s", " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Vlerat në diagonalen kryesore dhe lart saj: ");
        System.out.println();

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                if(j >= i)
                    System.out.printf("%7d", m[i][j]);
                else
                    System.out.printf("%7s", " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Vlerat në diagonalen tjeter dhe lart saj: ");
        System.out.println();

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                if(i + j <= m_row_col - 1)
                    System.out.printf("%7d", m[i][j]);
                else
                    System.out.printf("%7s", " ");
            }
            System.out.println();
        }





    }
}
