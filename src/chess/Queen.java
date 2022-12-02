package chess;

import abstractClasses.Square;

public class Queen extends ChessPiece{

	public Queen(String color, int[] coords) {
		super(color, coords);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean validMove(Square start, Square end) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(end.getContent()==null || end.getContent().getColor() != this.getColor()) {
			if(end.getCoords()[0] == start.getCoords()[0] || end.getCoords()[1] == start.getCoords()[1]) {
				result = true;
			}
			else if(end.getCoords()[0] - start.getCoords()[0] == end.getCoords()[1] - start.getCoords()[1]) {
				result = true;
			}
		}
		return result;
	}

}
