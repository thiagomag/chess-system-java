package br.com.thiago.chess.pieces;

import br.com.thiago.boardgame.Board;
import br.com.thiago.chess.ChessPiece;
import br.com.thiago.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
