package br.com.thiago.chess;

import br.com.thiago.boardgame.BoardExcepetion;

public class ChessException extends BoardExcepetion {

    public ChessException(String msg){
        super(msg);
    }
}
