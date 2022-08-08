package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

	private color color;

	public ChessPiece(Board board, color color) {
		super(board);
		this.color = color;
	}

	public color getColor() {
		return color;
	}

	
}
