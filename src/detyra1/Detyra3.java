package detyra1;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {
        /* Te shkruhet nje program i cili pranon numra nga -10000 deri ne 10000. Nese eshte
           shkruar brenda ketij rangu te shfaqet mesazhi “Numri eshte ne rangun e dhene”
           perndryshe te shfaqet mesazhi “Numri nuk eshte ne rangun e dhene” */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani nje numer: ");
        int numri = sc.nextInt();
        System.out.println( numri >= -10000 && numri <= 10000? "Numri eshte ne rangun e dhene" : "Numri nuk eshte ne rangun e dhene");



    }
}
