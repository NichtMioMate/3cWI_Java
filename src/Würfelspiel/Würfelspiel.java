package Würfelspiel;


import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {

    public static void main(String[] args) {


        boolean isFinished = false;
        System.out.println("Bitte erzählen Sie uns Ihren Namen ");
        Scanner namescan = new Scanner(System.in);
        String name = namescan.next();

        while (!isFinished) {

            int totalC = 0;
            int totalU = 0;

                System.out.println(" Hallo " + name + ", wählen Sie eine Aktion ");
                System.out.println(" 1 Spiel starten ");
                System.out.println(" 2 Abbrechen ");
                Scanner scanner = new Scanner(System.in);


                int selection = scanner.nextInt();


                            if (selection == 1) {
                                Random random = new Random();

                                for (int i = 0; i < 7; i++) {
                                    int randomNumberC = 1 + random.nextInt(6 - 1 + 1);
                                    int randomNumberU = 1 + random.nextInt(6 - 1 + 1);
                                    totalC += randomNumberC;
                                    totalU += randomNumberU; }

                                        if (totalC > totalU) {
                                            System.out.println("Du hast verloren. Der Score des Computers war " + totalC + ", dein Score war " + totalU); }

                                                else if (totalC < totalU) {
                                                    System.out.println("Du hast gewonnen. Dein Score war " + totalU ); }

                                                    else {
                                                         System.out.println("Unentschieden. Spielen Sie erneut. Ihr beide hattet " + totalC ); }
                            }

                                             else {
                                                System.out.println("Bis zum nächsten mal!");
                                                isFinished = true;
            }

        }
    }
}