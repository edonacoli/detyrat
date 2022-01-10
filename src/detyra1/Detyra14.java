package detyra1;

import java.util.Scanner;

public class Detyra14 {
    public static void main(String[] args) {
        /* Te shkruhet program I cili pranon nje numer dhe paraqet rezultatin si ne vijim
           Te shkruhet numri: 5
           Rezultati -------------------------------------------------------
           11
           1221
           123321
           12344321
           1234554321
           -----------------------------------------------------------------
           1
           121
           12321
           1234321
           123454321  */

        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani nje numer: ");
        int numri = sc.nextInt();
        for(int i = 1; i < numri + 1; i++){
            for (int j = 1; j < i + 1; j++)
                System.out.print(j);
            for (int j = i; j > 0; j--)
                System.out.print(j);
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < numri + 1; i++){
            for (int j = 1; j < i + 1; j++)
                System.out.print(j);
            for (int j = (i - 1); j > 0; j--)
                System.out.print(j);
            System.out.println();
        }

    }
}
