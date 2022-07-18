package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces){
        // método estático é aquele que não precisa de uma instancia para ser chamado.

        for (int i = 0; i < pieces.length; i++){

            System.out.print((8-i) + " ");

            for (int j = 0; j < pieces.length; j++) {

                printPiece(pieces[i][j]);

            }

            System.out.println();
        }

        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece piece){
        //imprime uma peça

        if (piece == null){
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }

        System.out.print(" ");
    }
}
