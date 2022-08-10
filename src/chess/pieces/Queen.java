package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.color;

public class Queen extends ChessPiece{

	public Queen(Board board, color color) {
		super(board, color);	
	}

	@Override
	public String toString() {
		return "Q";
	}
}
