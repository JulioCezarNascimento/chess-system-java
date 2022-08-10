package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.color;
public class King extends ChessPiece{

	public King(Board board, color color) {
		super(board, color);	
	}

	@Override
	public String toString() {
		return "K";
	}
}
