package detyra2;
import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {
        /* Te mbushet matrica 2x2 me vlera dinamike nga shfrytezuesi, dhe te shtypet ne
           formën e matricës */

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Shkruani elementin ne poziten %d%d: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%5d", matrix[i][j]);;
            }
            System.out.println();
        }

        /* Matrica mund te shtypet edhe ne formen
           for(int[] row : matrix) {
             for(int col : row) {
               System.out.printf("%5d", col);
             }
             System.out.println();
           }  */


    }
}


