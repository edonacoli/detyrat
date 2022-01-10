package detyra2;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        /* Te mbushen dy matrica a dhe b me vlera dhe te gjendet matrica
            e re c, e cila është  prodhimi i dy matricave a dhe b */

        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruaj numrin e reshtave te matrices a: ");
        int a_row = sc.nextInt();
        System.out.print("Shkruaj numrin e kolonave te matrices a: ");
        int a_col = sc.nextInt();
        System.out.print("Shkruaj numrin e kolonave te matrices b: ");
        int b_col = sc.nextInt();
        int b_row = a_col;

        int[][] a = new int[a_row][a_col];
        int[][] b = new int[b_row][b_col];

        for (int i = 0; i < a_row; i++) {
            for (int j = 0; j < a_col; j++) {
                System.out.printf("Shkruani elementin e matrices a ne poziten %d%d: ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < b_row; i++) {
            for (int j = 0; j < b_col; j++) {
                System.out.printf("Shkruani elementin e matrices b ne poziten %d%d: ", i, j);
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        int c[][] = new int[a_row][b_col];

        for (int i = 0; i < a_row; i++) {
            for (int j = 0; j < b_col; j++) {
                for (int k = 0; k < a_col; k++) {

                    c[i][j] += a[i][k]*b[k][j];

                }
            }
        }
        System.out.println("Matrica a: ");

        for(int[] row : a) {
            for(int col : row) {
                System.out.printf("%5d", col);
            }
            System.out.println();
        }

        System.out.println("Matrica b: ");

        for(int[] row : b) {
            for(int col : row) {
                System.out.printf("%5d", col);
            }
            System.out.println();
        }

        System.out.println("Matrica c = a*b: ");

        for(int[] row : c) {
            for(int col : row) {
                System.out.printf("%5d", col);
            }
            System.out.println();
        }


    }
}
