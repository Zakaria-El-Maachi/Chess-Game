package chess;

import abstractClasses.Square;

public class Rook extends ChessPiece{

	public Rook(String color, int[] coords) {
		super(color, coords);
	}

	@Override
	protected boolean validMove(Square start, Square end) {
		boolean result = false;
		if(end.getContent()==null || end.getContent().getColor() != this.getColor()) {
			if(end.getCoords()[0] == start.getCoords()[0] || end.getCoords()[1] == start.getCoords()[1]) {
				result = true;
			}
		}
		return result;
	}

}
