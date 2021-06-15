package br.com.thiago.boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardExcepetion("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece (int row, int column){
        if(!positionExists(row, column)) {
            throw new BoardExcepetion("Position not on the board");
        } else {
            return pieces[row][column];
        }
    }

    public Piece piece(Position position){
        if(!positionExists(position)) {
            throw new BoardExcepetion("Position not on the board");
        } else {
            return pieces[position.getRow()][position.getColumn()];
        }
    }

    public void placePiece(Piece piece, Position position) {
        if(thereIsAPiece(position)) {
            throw new BoardExcepetion("There is already a piece on position " + position);
        } else {
            pieces[position.getRow()][position.getColumn()] = piece;
            piece.position = position;
        }
    }

    public boolean positionExists(int row, int column) {
       return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if(!positionExists(position)) {
            throw new BoardExcepetion("Position not on the board");
        } else {
            return piece(position) != null;
        }
    }
}
