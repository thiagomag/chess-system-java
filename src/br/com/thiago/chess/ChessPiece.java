package br.com.thiago.chess;

import br.com.thiago.boardgame.Board;
import br.com.thiago.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
