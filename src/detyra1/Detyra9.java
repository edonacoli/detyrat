package detyra1;

import java.util.Scanner;

public class Detyra9 {
    public static void main(String[] args) {
        /* Shkruaj programin i cili shfaq figurat ne dispozicion (trekendesh, drejtkendesh,
           katror) dhe varesisht nga perzgjedhja te shfaq figuren e dhene */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cilen nga figurat deshironi te shfaqni: \n 1 - Trekendesh \n 2 - Drejtkendesh \n 3 - Katror");
        System.out.print("Zgjedhni 1, 2 ose 3: ");
        int zgjedhja = sc.nextInt();
        switch (zgjedhja){
            case 1:
                System.out.println("    *  ");
                System.out.println("  * * * ");
                System.out.println("* * * * *");
                break;
            case 2:
                for(int i = 1; i < 4; i++){
                    for(int j = 1; j < 6; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i = 1; i < 6; i++){
                    for(int j = 1; j < 6; j++){
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                break;


        }

    }
}
