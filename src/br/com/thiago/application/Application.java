package br.com.thiago.application;

import br.com.thiago.chess.ChessMatch;

public class Application {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
