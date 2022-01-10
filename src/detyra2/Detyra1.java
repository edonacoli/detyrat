package detyra2;

public class Detyra1 {
    public static void main(String[] args) {
        /*  2♣ 3♣ 4♣ 5♣ ... A♣ 2♦ 3♦ 4♦ 5♦ ... A♦ ... A♠
            2♣ 2♦ 2♥ 2♠ 3♣ 3♦ 3♥ 3♠ ...
         */
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♣️", "♦️", "♥️", "♠️"};
        String[] deck1 = new String[52];
        String[] deck2 = new String[52];

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                deck1[13*j + i] = ranks[i] + suits[j];
            }
        }


        System.out.println();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                deck2[4*i + j] = ranks[i] + suits[j];
            }
        }



        for (int i = 0; i < 52; i++)
            System.out.print(deck1[i]);

        System.out.println();

        for (int i = 0; i < 52; i++)
            System.out.print(deck2[i]);






    }
}
