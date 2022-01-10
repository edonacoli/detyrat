package detyra1;

import java.util.Random;
import java.util.Scanner;

public class Detyra11 {
    public static void main(String[] args) {
        /* Të shkruhet programi qe gjeneron një numër ne prapavije (random) dhe kërkon shfrytëzuesit
           qe te qëllon numrin e gjeneruar nga 0 deri ne 10
           • Nëse e qëllon te shfaqet mesazhi “ Urime e keni qelluar "
           • Nëse nuk e qëllon " Suksese herën tjetër ”
           Te shkruhet nje program për lojën me zare – hedhja e dy zareve dhe përdoruesi
           te shkruan shumen e vlerave te rena ne dy zaret
           • Nëse e qëllon te shfaqet mesazhi “ urime e keni qelluar "
           • Nëse nuk e qëllon " Suksese herën tjetër ” */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int N = random.nextInt(11);
        System.out.print("Qello numrin e gjeneruar nga 0 deri ne 10: ");
        int n = sc.nextInt();
        if(n == N)
            System.out.println("Urime e keni qelluar");
        else
            System.out.println("Suksese heren tjeter");
        System.out.println(N);

        System.out.println("---------------------------------------");


        int zari1 = random.nextInt(6) + 1;
        int zari2 = random.nextInt(6) + 1;
        int sum = zari1 + zari2;
        System.out.print("Zaret jane hedhur, qelloni rezultatin: ");
        int rez = sc.nextInt();
        if (rez == sum)
            System.out.println("Urime e keni qelluar");
        else
            System.out.println("Suksese heren tjeter");
        System.out.print(zari1 + " ");
        System.out.println(zari2);



    }
}
