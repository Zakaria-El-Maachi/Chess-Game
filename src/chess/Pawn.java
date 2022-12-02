package chess;
import java.lang.Math;  
import abstractClasses.Square;

public class Pawn extends ChessPiece{

	public Pawn(String color, int[] coords) {
		super(color, coords);
	}

	@Override
	protected boolean validMove(Square start, Square end) {
		boolean result = false;
		if(end.getContent()==null) {
			if(start.getCoords()[1] == end.getCoords()[1]) {
				if(this.getColor() == "white") {
					if(start.getCoords()[0] == 7) {
						if(end.getCoords()[0] == 5 || end.getCoords()[0] == 6) {
							result = true;
						}
					}
					else {
						if(end.getCoords()[0] - start.getCoords()[0] == -1) {
							result = true;
						}
					}
				}
				else if(this.getColor() == "black") {
					if(start.getCoords()[0] == 0) {
						if(end.getCoords()[0] == 1 || end.getCoords()[0] == 2) {
							result = true;
						}
					}
					else {
						if(end.getCoords()[0] - start.getCoords()[0] == 1) {
							result = true;
						}
					}				
				}
			}
		}
		else if(end.getContent()!=null && end.getContent().getColor() != this.getColor()) {
			if(Math.abs(end.getCoords()[0] - start.getCoords()[0]) == 1) {
				if(this.getColor() == "black" && end.getCoords()[1] == start.getCoords()[1]+1) {
					result = true;
				}
				else if(this.getColor() == "white" && end.getCoords()[1] == start.getCoords()[1]-1) {
					result = true;
				}
			}
		}
		return result;
	}
	
}
