package detyra1;

import java.util.Scanner;

public class Detyra15 {
    public static void main(String[] args) {
        /*  Kontrollo se a eshte teksti i dhene palindrome
            p.sh madam eshte palindrom*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani nje fjale: ");
        String teksti = sc.nextLine();
        int gjatesia = teksti.length();
        String s = "";
        for(int i = 0; i < gjatesia; i++){
            s += teksti.charAt(gjatesia - 1 - i);
        }
        if(s.equals(teksti))
            System.out.println("Fjala qe keni shkruar eshte palindrome");
        else
            System.out.println("Fjala e shenuar nuk eshte palindrome");

    }
}
