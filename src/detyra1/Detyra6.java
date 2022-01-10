package detyra1;

import java.util.Scanner;

public class Detyra6 {
    public static void main(String[] args) {
        /* Te shkruhet program i cili varesisht pikeve ne provim gjen noten tuaj
            Nese piket jane nga 0-49 – nota 5
            Nese piket jane nga 50-59 – nota 6
            Nese piket jane nga 60-69 – nota 7
            Nese piket jane nga 70-79 – nota 8
            Nese piket jane nga 80-89 – nota 9
            Nese piket jane nga 90-100 – nota 10
            Pike negative dhe piket mbi 100 nuk duhet lejuar ne shkolle */
        Scanner sc = new Scanner(System.in);
        System.out.print("Numri i pikeve: ");
        int piket = sc.nextInt();
        if (piket > 100)
            System.out.println("Piket maksimale jane 100");
        else if (piket > 89)
            System.out.println("Nota juaj eshte 10");
        else if (piket > 79)
            System.out.println("Nota juaj eshte 9");
        else if (piket > 69)
            System.out.println("Nota juaj eshte 8");
        else if (piket > 59)
            System.out.println("Nota juaj eshte 7");
        else if (piket > 49)
            System.out.println("Nota juaj eshte 6");
        else if (piket >= 0)
            System.out.println("Nota juaj eshte 5");
        else
            System.out.println("Keni shtypur numer negativ, piket mund te jene nga 0-100");

    }
}
