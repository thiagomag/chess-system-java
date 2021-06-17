package br.com.thiago.application;

import br.com.thiago.chess.ChessMatch;
import br.com.thiago.chess.ChessPiece;
import br.com.thiago.chess.ChessPosition;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner input = new Scanner(System.in);

        while(true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(input);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(input);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
