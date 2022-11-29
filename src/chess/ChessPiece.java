package chess;

import abstractClasses.*;

public abstract class ChessPiece extends Piece{
	public ChessPiece(String color, int[] coords) {
		super("", color, coords);
		this.getClass().getCanonicalName().substring(0, 1)
	}
	
	@Override
	public Move move(Square start, Square end) {
		if (validMove(start, end)) {
			start.getContent().setCoords(end.getCoords());
			end.getContent().setTaken(true);
			Move resultMove = new Move(start.getContent(), end.getContent(), start, end);
			end.setContent(null);
			return resultMove;
		}
		else {
			return null;
		}
	}
}
