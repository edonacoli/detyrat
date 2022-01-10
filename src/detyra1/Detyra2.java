package detyra1;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        /* Te shkruhet program i cili pranon dy numra dhe operatorin (+,-,/,*,%) dhe i cili
           varesisht nga operatori qe ka zgjedhur gjen rezultatin.
           Si dhe te shtohet edhe validimi ne rast te pjestimit me zero */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani numrin e pare: ");
        double numri1 = sc.nextDouble();
        System.out.print("Shkruani numrin e dyte: ");
        double numri2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Zgjedhni njerin nga operatoret +, -, /, *, %: ");
        char operatori = sc.next().charAt(0);
        if(operatori == '+')
            System.out.printf("%.2f %s %.2f = %.2f", numri1, operatori, numri2, numri1 + numri2 );
        else if(operatori == '-')
            System.out.printf("%.2f %s %.2f = %.2f", numri1, operatori, numri2, numri1 - numri2 );
        else if(operatori == '/') {
            if(numri2 == 0)
                System.out.println("Pjesetimi me zero eshte i papercaktuar");
            else
                System.out.printf("%.2f %s %.2f = %.2f", numri1, operatori, numri2, numri1 / numri2 );}
        else if(operatori == '*')
            System.out.printf("%.2f %s %.2f = %.2f", numri1, operatori, numri2, numri1 * numri2 );
        else if(operatori == '%'){
            if(numri2 == 0)
                System.out.println("Pjesetimi me zero eshte i papercaktuar");
            else
                System.out.printf("%.2f %s %.2f = %.2f", numri1, operatori, numri2, numri1 % numri2 );}
        else
            System.out.print("Ju lutem shkruani njerin nga simbolet +, -, /, *, %");

    }
}
