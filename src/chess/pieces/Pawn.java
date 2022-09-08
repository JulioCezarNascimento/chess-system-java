package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.color;

public class Pawn extends ChessPiece{
	public Pawn(Board board, color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);

		if (getColor() == chess.color.WHITE) {
			p.setValues(position.getRow() - 1, position.getCollum());
			if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getCollum()] = true;
			}
			p.setValues(position.getRow() - 2, position.getCollum());
			Position p2 = new Position(position.getRow() - 1, position.getCollum());
			if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExistis(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getCollum()] = true;
			}
			p.setValues(position.getRow() - 1, position.getCollum() - 1);
			if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getCollum()] = true;
			}			
			p.setValues(position.getRow() - 1, position.getCollum() + 1);
			if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getCollum()] = true;
			}			
		}
		else {
			p.setValues(position.getRow() + 1, position.getCollum());
			if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getCollum()] = true;
			}
			p.setValues(position.getRow() + 2, position.getCollum());
			Position p2 = new Position(position.getRow() - 1, position.getCollum());
			if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExistis(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getCollum()] = true;
			}
			p.setValues(position.getRow() + 1, position.getCollum() - 1);
			if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getCollum()] = true;
			}			
			p.setValues(position.getRow() + 1, position.getCollum() + 1);
			if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getCollum()] = true;
			}	
		}
		return mat;
	}
	
	@Override
	public String toString() {
		return "P";
	}
	
}
