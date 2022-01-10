package detyra1;

import java.util.Scanner;

public class Detyra7 {
    public static void main(String[] args) {
        // switch teston vetem byte, int, char, String
        /* Te shkruhet aplikacioni i cili shfaq menu-te dhe menyren e perzgjedhjes se tyre,
           pas perzgjedhjes te shfaqet mesazhi per menu-ne e perzgjedhur?
           1 – File
           2 – Edit
           3 – View
           4 – Help
           5 - Tools
           Tjeter – Per Exit */
        Scanner sc = new Scanner(System.in);
        System.out.println("Zgjedhni njeren nga menu-te e meposhtme, duke zgjedhur numrin perkates: \n 1 - File \n " +
                "2 - Edit \n 3 - View \n 4 - Help \n 5 - Tools");
        System.out.print("--> ");
        int numri = sc.nextInt();
        switch (numri){
            case 1:
                System.out.println("Ju keni zgjedhur menu-ne File");
                break;
            case 2:
                System.out.println("Ju keni zgjedhur menu-ne Edit");
                break;
            case 3:
                System.out.println("Ju keni zgjedhur menu-ne View");
                break;
            case 4:
                System.out.println("Ju keni zgjedhur menu-ne Help");
                break;
            case 5:
                System.out.println("Ju keni zgjedhur menu-ne Tools");
                break;
            default:
                System.out.println("Exit");
                break;

        }


    }
}
