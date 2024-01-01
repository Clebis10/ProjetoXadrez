package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChesMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChesMatch chessMatch = new ChesMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
