package detyra1;

import java.util.Scanner;

public class Detyra10 {
    public static void main(String[] args) {
        /* Te shkruhet programi i cili kërkon prej përdoruesit nje tekst
           a) Pasi shfrytëzuesi te shkruan tekstin atëherë programi shfaq ne program numrin e
              karaktereve qe teksti përmban?
           b) Pasi shfrytëzuesi te jep tekstin atëherë program paraqet mesazhin:
              Shkruaj indeksin nga 0 deri me A (A- gjatësia e tekstit paraprak) për ta paraqitur tekstin nga
              indeksi deri ne fund: Pasi shfrytëzuesi shkruan atë numër të shfaqet pjesa e tekstit nga ai indeks deri ne fund */
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani nje tekst: ");
        String teksti = sc.nextLine();
        int gjatesia = teksti.length();
        int count = 0;
        for(int i = 0; i < gjatesia; i++){
            if(teksti.charAt(i) != ' '){
                count++;
            }
          }
        System.out.println("Teksti permban " + count + " karaktere");
        System.out.print("Shkruaj nje indeks nga 0 deri ne " + gjatesia + " dhe do paraqitet teksti nga ai indeks deri ne fund: ");
        int indeksi = sc.nextInt();
        System.out.print(teksti.substring(indeksi));



        }

    }

