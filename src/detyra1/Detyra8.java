package detyra1;

import java.util.Scanner;

public class Detyra8 {
    public static void main(String[] args) {
        /* Te shkruhet program i cili pranon parameter ekipin vendas dhe ekipin musafir dhe
           prognozen tuaj si vijon:
            1 – per fitore te ekipit vendas
            X – per barazim
            2 – per fitore te ekipit musafir
           Mesazhi qe shfaqet te jete si vijon:
           Prognoza ime per ndeshjen ndermjet ekipi1 vs ekipi2 eshte se (fiton ekipi1 apo fiton
           ekipi2 apo perfundon me barazim) */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ekipi vendas: ");
        String ekipi1 = sc.nextLine();
        System.out.print("Ekipi musafir: ");
        String ekipi2 = sc.nextLine();
        System.out.println("Si do perfundoj ndeshja? \n Zgjedh 1 per fitore te ekipit vendas \n " +
                "Zgjedh x per barazim \n Zgjedh 2 per fitore te ekipit musafir");
        char prognoza = sc.next().charAt(0);
        switch(prognoza) {
            case '1':
                System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se fiton %s",ekipi1, ekipi2, ekipi1);
                break;
            case 'x', 'X':
                System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte %s",ekipi1, ekipi2, "barazim");
                break;
            case '2':
                System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se fiton %s",ekipi1, ekipi2, ekipi2);
                break;
        }



    }
}
