package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.color;

public class King extends ChessPiece {

	public King(Board board, color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		// above
		p.setValues(position.getRow() - 1, position.getCollum());
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getCollum()] = true;
		}

		// below
		p.setValues(position.getRow() + 1, position.getCollum());
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getCollum()] = true;
		}

		// left
		p.setValues(position.getRow(), position.getCollum() - 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getCollum()] = true;
		}

		// right
		p.setValues(position.getRow(), position.getCollum() + 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getCollum()] = true;
		}

		// nw
		p.setValues(position.getRow() - 1, position.getCollum() - 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getCollum()] = true;
		}

		// ne
		p.setValues(position.getRow() - 1, position.getCollum() + 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getCollum()] = true;
		}

		// sw
		p.setValues(position.getRow() + 1, position.getCollum() - 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getCollum()] = true;
		}
		
		// se
		p.setValues(position.getRow() + 1, position.getCollum() + 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getCollum()] = true;
		}

		return mat;
	}
}