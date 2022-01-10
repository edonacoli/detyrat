package detyra1;

import java.util.Scanner;

public class Detyra13 {
    public static void main(String[] args) {
        /*  Shkruaj programin i cili pranon nje numer N dhe zgjedh se a po deshiron me shtyp
             numrin cift apo tek, varesisht nga perzgjedhja te shtypen numrat nga 1 deri ne N
             dhe te shtypen numrat sipas perzgjedhjes  */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani nje numer: ");
        int N = sc.nextInt();
        System.out.print("Deshironi te shfaqni numrat cift apo tek nga 1 deri ne " + N + "? \nNese deshironi numrat cift " +
                "shkruaj c, ne te kunderten shkruaj t: ");
        sc.nextLine();
        char s = sc.next().charAt(0);
        if(s == 'c' || s == 'C'){
            int i = 2;
            while(i < N + 1){
                if(i % 2 == 0)
                    System.out.print(i + " ");
                i++;

            }
        }
        else if(s == 't' || s == 'T'){
            int i = 2;
            while(i < N + 1){
                if(i % 2 != 0)
                    System.out.print(i + " ");
                i++;

            }
        }
        else
            System.out.println("Ju lutem shkruani c ose t");


    }
}
