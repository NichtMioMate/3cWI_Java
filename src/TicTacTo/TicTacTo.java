package TicTacTo;

import java.util.Scanner;

public class TicTacTo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Herzlich Wilkommen zu dem TicTacToe Spiel!");
        System.out.println("Wie heißt Spieler 1?");

        String p1 = in.nextLine();

        System.out.println("Wie heißt Spieler 2?");

        String p2 = in.nextLine();


        char[][] board = new char[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';

            }
        }

        drawBoard(board);

        boolean isPlayer1 = true;

        char symbol = ' ';
        if (isPlayer1) {
            symbol = 'x';
        } else {
            symbol = 'o';
        }

        if(isPlayer1){
            System.out.println(p1 + "s Zug (x):");
        }
        else {
            System.out.println(p2 + "s Zug (o):");

        }

        int row = 0;
        int col = 0;


        while (true) {
            System.out.println("Wähle eine Zeile aus ( 0, 1 oder 2): ");
            row = in.nextInt();

            System.out.println("Wähle eine Spalte aus ( 0, 1 oder 2): ");
            col = in.nextInt();

            // Bei Mac Tastatur für || option + 7 drücken
            if (row < 0 || col < 0 || row > 2 || col > 2) {
                System.out.println("Dies Spalte und Zeile gibt es nich!");
            } else if (board[row][col] != '-') {
                System.out.println("Dieser Platz wurde schon verwendet");
            } else {
                break;
            }


        }
        board[row][col] = symbol;
        drawBoard(board);
    }

    public static void drawBoard(char[][] board) {
        for (int i = 0; i <3; i++) {
            for (int j = 0; j<3; j++ ) {
               System.out.print(board[i][j]);

            }
            System.out.println();
        }
    }
}
