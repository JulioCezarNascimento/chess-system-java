package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		
		while (true) {
		UI.printBoard(chessmatch.getPieces());
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(null);
		
		System.out.println();
		System.out.println("Target: ");
		ChessPosition target = UI.readChessPosition(null);
		
		ChessPiece capturedPiece = ChessMatch.performChessMove(source, target);
		} 	
	}
}
