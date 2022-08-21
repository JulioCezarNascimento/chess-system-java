package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.color;
public class Rook extends ChessPiece{

	public Rook(Board board, color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return null;
	}
}
