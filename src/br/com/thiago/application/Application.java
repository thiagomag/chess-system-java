package br.com.thiago.application;

import br.com.thiago.chess.ChessException;
import br.com.thiago.chess.ChessMatch;
import br.com.thiago.chess.ChessPiece;
import br.com.thiago.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner input = new Scanner(System.in);

        while(true){
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(input);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(input);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            } catch (ChessException | InputMismatchException e) {
                System.err.println(e.getMessage());
                input.nextLine();
            }

        }
    }
}
