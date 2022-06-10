package TestKaffeeMaschine;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String Nein = "Nein";
        String Ja = "Ja";
        String Abschalten = "Abschalten";
        int Watertank = 1000;

        System.out.println("Möchten sie die Kaffemaschine einschalten?");


        while (true) {

            String Coffee = sc.next();

            if (Coffee.equals(Ja)) {
                System.out.println("Die Kaffemaschine ist an.");

                System.out.print("Wie viel Kaffe hätten Sie gerne? (40-200 ml) ");
                int CoffeSize = sc.nextInt();
                if (CoffeSize > 200)
                    break;

                System.out.println("Wie stark hätten Sie gerne ihren Kaffe? (1-10)");
                int CoffeStrength = sc.nextInt();
                if (CoffeStrength > 11)
                    break;


                System.out.println("Wasser Stand ist niedrig. Möchten Sie das Wasser auffüllen? (Ja/Nein)");
                String Waterlevel = sc.next();

                if (Waterlevel.equals(Ja)) {
                    System.out.println("Das Wasser wurde aufgefüllt!");

                    System.out.println("Keine Kaffebohnen in der Maschine. Möchten Sie die Bohnen auffüllen? (Ja/Nein)");
                    String CoffeBeans = sc.next();

                    if (Waterlevel.equals(Nein)) {
                        System.out.println("Ohne Bohnen kein Kafee!");


                        if (CoffeBeans.equals(Ja)) {
                            System.out.println("Die Maschine ist nun bereit Kaffe zu machen!");

                            System.out.println("Passen diese Einstellungen? (Ja/Nein)");
                            System.out.println("Größe des Kaffees sind " + CoffeSize + " ml");
                            System.out.println("Die Stärke des Kaffees ist " + CoffeStrength + " ");
                            String CoffeSettings = sc.next();

                            if (CoffeSettings.equals(Ja)) {
                                System.out.println("Die Maschine ist nun bereit Kaffe zu machen!");
                                System.out.println("Möchten Sie nun den Kaffe rauslassen? (Ja/Nein)");

                                String CoffeMaking = sc.next();

                                if (CoffeMaking.equals(Ja)) {
                                    System.out.println("Dein " + CoffeSize + " ml großer Kaffee mit der Stärke von " + CoffeStrength + " ist nun bereit zum Verzehren!");
                                    int WaterLevelAtEnd = Watertank - CoffeSize;
                                    System.out.println("Im Wassertank sind noch " + WaterLevelAtEnd + " ml ");
                                    System.out.println("Die Bohnen reichen noch für 10 weitere male!");
                                    System.out.println("Möchten Sie die Kaffemaschine abschalten? (Abschalten)");


                                    String MaybeEnd = sc.next();

                                    if (MaybeEnd.equals(Abschalten)) {
                                        System.out.println("Die Maschine wird nun Abgeschaltet.");
                                        break;

                                    }


                                }
                            }


                        }

                    }
                }
            }
        }

    }
}