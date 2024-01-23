package application;

import java.util.Scanner;

import chess.ChesMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ChesMatch chessMatch = new ChesMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}

}
