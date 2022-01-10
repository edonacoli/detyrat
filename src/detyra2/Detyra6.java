package detyra2;

import java.util.Scanner;

public class Detyra6 {
    public static void main(String[] args) {
        /* Dimensioni dhe Vlerat e nje matrice katrore te caktohen
           nga shfrytëzuesi. Me pas:
           * Të gjendet matrica e transponuar e saj */

        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruaj numrin e rreshtave dhe kolonave te matrices: ");

        int m_row_col = sc.nextInt();
        int[][] m = new int[m_row_col][m_row_col];

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                System.out.printf("Shkruani elementin e matrices a ne poziten %d%d: ", i, j);
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrica e fituar: ");

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                if (i > j) {
                    int t = m[i][j];
                    m[i][j] = m[j][i];
                    m[j][i] = t;
                }
            }
        }

        System.out.println("Matrica e transponuar e matrices se dhene: ");

        for (int i = 0; i < m_row_col; i++) {
            for (int j = 0; j < m_row_col; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();
        }



    }
}
