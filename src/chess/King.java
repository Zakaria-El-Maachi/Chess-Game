package chess;
import java.lang.Math;  
import abstractClasses.Square;

public class King extends ChessPiece{

	public King(String color, int[] coords) {
		super(color, coords);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean validMove(Square start, Square end) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(end.getContent()==null || end.getContent().getColor() != this.getColor()) {
			if(Math.abs(end.getCoords()[0] - start.getCoords()[0]) == 1 && Math.abs(end.getCoords()[1] - start.getCoords()[1]) == 1) {
				result = true;
			}
			else if(Math.abs(end.getCoords()[0] - start.getCoords()[0]) == 1 && Math.abs(end.getCoords()[1] - start.getCoords()[1]) == 0){
				result = true;
			}
			else if(Math.abs(end.getCoords()[0] - start.getCoords()[0]) == 0 && Math.abs(end.getCoords()[1] - start.getCoords()[1]) == 1){
				result = true;
			}
		}
		return result;
	}

}
