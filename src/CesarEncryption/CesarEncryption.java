package CesarEncryption;

import java.util.Scanner;

public class CesarEncryption {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Welchen Text wollen Sie verschlüsseln?");

        String text = scanner.nextLine();



            char [] myArray = text.toCharArray();


            char [] newArray = encrypting(2,myArray);


            System.out.println("So sieht der verschlüsselt Text aus:");

            for (int i = 0; i < newArray.length; i++) {

                System.out.print(newArray[i]);
            }
        }

    public static char[] encrypting(int offset, char[] charArray) {

        char[] cryptArray = new char[charArray.length];


        for (int i = 0; i < charArray.length; i++) {

            int shift = (charArray[i] + 2) % 128;


            cryptArray[i] = (char) (shift);

        }
        return cryptArray;


    }

}



