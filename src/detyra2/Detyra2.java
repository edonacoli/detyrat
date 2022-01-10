package detyra2;

import java.util.Random;
import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        /*  Create an array of N elements of numbers (N get from user),
           1. Those elements randomly assign the value between 1 and 100
           2. Print those elements from first to last index
           3. Print those elements from last to first index
           4. Find Sum of all elements */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkrani gjatesine e vargut: ");
        int N = sc.nextInt();
        int[] array = new int[N];
        Random random = new Random();

        for (int i =0; i < N; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < N; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        for (int i = N - 1; i >= 0; i--)
            System.out.print(array[i] + " ");

        System.out.println();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }
        System.out.println("Shuma e elementeve te vargut eshte " + sum);

        /* Shumen mundemi me llogarit edhe ne formen:
           for (int number: array)
              sum += number; */






    }
}
