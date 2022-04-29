package Bankautomaten.lins;

import java.util.Random;
import java.util.Scanner;




    public class Cashmaschine {
        public static void main(String[] args) {

                 int total = 0;

                System.out.println("Geben sie bitte ihren Namen ein");
                Scanner namescan = new Scanner(System.in);
                String name = namescan.next();


                            boolean Ended = false;

                            while (!Ended) {
                            System.out.println("Hallo " + name + ", was möchten sie tun?");
                            System.out.println(" 1 - Einzahlen");
                            System.out.println(" 2 - Abheben");
                            System.out.println(" 3 - Kontostand");
                            System.out.println(" 4 - Beenden");
                            Scanner scanner = new Scanner(System.in);


                        int selection = scanner.nextInt();
                        if (selection == 1) {
                        System.out.println("Wie viel Geld möchten sie Einzahlen?");
                        Scanner scan01 = new Scanner(System.in);
                        Double NewIn = scan01.nextDouble();
                        Double plus = NewIn;
                        System.out.println("Sie haben " + NewIn + "€ eingezahlt.");
                        total += plus;
                        }

                        else if (selection == 2) {
                        System.out.println("Wie viel Geld möchten sie gerne Abheben?");
                        Scanner scan02 = new Scanner(System.in);
                        Double NewOut = scan02.nextDouble();

                        var minus = NewOut;

                        System.out.println("Sie haben " + NewOut + "€ abgehoben.");

                        total -= minus;

                    }


                        else if (selection == 3) {
                        System.out.println(name + ", dein Kontostand beträgt derzeit " + total + " €");


                    }
                        else {
                        System.out.println("Ok, der Vorgang wurde Beendet und Sie werden nun Abgemeldet");
                        Ended = true;

                    }


                }


            }
        }


