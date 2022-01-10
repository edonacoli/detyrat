package detyra1;

import java.util.Scanner;

public class Detyra12 {
    public static void main(String[] args) {
        /* Te shkruhet program i cili pranon nje numer dhe shtyp sekuncen si ne vijim:
           Shkruaj numrin: 5
           * * * * *
           * * * *
           * * *
           * *
           *                        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int numri = sc.nextInt();
        String s = "*";
        for(int i = numri; i > 0; i--){
            System.out.println(s.repeat(i));
        }
    }
}
