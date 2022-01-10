package detyra1;

import java.util.Scanner;

public class Detyra5 {
    public static void main(String[] args) {
       /* Te shkruhet nje program per shkallezimin e pages sipas deshires, psh:
          0 – pa page
          0-80 social
          80-120 social+ ose pensioner
          120-180 – page minimale
          180-300 – page mesatare
          300-400 – page mbi mesatare
          400-600 – page e mire
          600+ page e larte  */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shenoni pagen tuaj: ");
        double paga = sc.nextDouble();
        if(paga > 600)
            System.out.println("Paga juaj eshte e larte");
        else if (paga > 400)
            System.out.println("Paga juaj eshte e mire");
        else if (paga > 300)
            System.out.println("Paga juaj eshte mbi mesatare");
        else if (paga > 180)
            System.out.println("Paga juaj eshte mesatare");
        else if (paga > 120)
            System.out.println("Paga juaj eshte minimale");
        else if (paga > 80)
            System.out.println("Paga juaj eshte mbi mesatare");
        else if (paga > 0)
            System.out.println("Ju jeni pensioner ose merrni social");
        else
            System.out.println("Pa page");
    }
}
