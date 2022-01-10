package detyra1;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        /* Te shkruhet program i cili pranon dy numra, dhe te gjendet se a jane te
           plotepjestueshem numri i pare me numrin e dyte. Nese eshte i plotpjestueshem te
           shkruhet mesazhi “nr1 eshte i plotepjestueshem me nr2” perndryshe “nr1 nuk eshte
           i plotpjestueshem me nr2”
           Te plotesohet program paraprak ne formon qe te gjenden se a jane keto dy numra te
           plotepjestueshe me njeri tjetrin dhe te shfaqen mesazhet si me larte duke shtuar
           nese numri2 eshte I plotepjestueshem me numrin1 atehere “nr2 eshte I
           plotepjestueshem me nr1” */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani numrin e pare: ");
        int numri1 = sc.nextInt();
        System.out.print("Shkruani numrin e dyte: ");
        int numri2 = sc.nextInt();
        if(numri1 % numri2 == 0)
            System.out.println("Numri " + numri1 + " eshte i plotepjestueshem me numrin " + numri2);
        else
            System.out.println("Numri " + numri1 + " eshte i plotepjestueshem me numrin " + numri2);
            /* Ne rastin e dyte kemi:
               if(numri1 % numri2 == 0)
                   System.out.println("Numri " + numri1 + " eshte i plotepjestueshem me numrin " + numri2);
               else if(numri2 % numri1 == 0)
                   System.out.println("Numri " + numri2 + " eshte i plotepjestueshem me numrin " + numri1);
               else
                   System.out.printf("Keta dy numra %d, %d nuk jane te plotepjestueshem me njeri-tjetrin", numri1, numri2); */


    }
}
