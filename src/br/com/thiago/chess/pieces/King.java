package br.com.thiago.chess.pieces;

import br.com.thiago.boardgame.Board;
import br.com.thiago.chess.ChessPiece;
import br.com.thiago.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
