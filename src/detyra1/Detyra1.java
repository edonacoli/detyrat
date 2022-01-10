package detyra1;
import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        /* Te shkruhet program semafori i cili pranon nje numer: nese numri eshte 1 te
            shfaqet mesazhi semafori eshte i kuq, nese numri eshte 2 semafori eshte i verdhe,
            nese numri eshte 3 semafori eshte i gjelbert, nese numri eshte 4 semafori eshte
            duke blinkuar, per numra te tjere semafori nuk eshte i leshuar fare (mungon rryma) */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani nje numer: ");
        int numri = sc.nextInt();
        if(numri == 1)
            System.out.println("Semafori eshte i kuq");
        else if(numri == 2)
            System.out.println("Semafori eshte i verdhe");
        else if (numri == 3)
            System.out.println("Semafori eshte i gjelbert");
        else if(numri == 4)
            System.out.println("Semafori eshte duke blinkuar");
        else
            System.out.println("Semafori nuk eshte i leshuar fare, mungon rryma!");
    }
}
