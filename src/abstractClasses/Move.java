package abstractClasses;

public class Move {
	
	private Player player;
	private Piece piece;
	private Piece takenPiece;
	private Square start;
	private Square end;
	
	
	public Move(Piece piece, Piece takenPiece, Square start, Square end) {
		this.piece = piece;
		this.takenPiece = takenPiece;
		this.start = start;
		this.end = end;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}


	/**
	 * @return the piece
	 */
	public Piece getPiece() {
		return piece;
	}


	/**
	 * @return the takenPiece
	 */
	public Piece getTakenPiece() {
		return takenPiece;
	}


	/**
	 * @return the start
	 */
	public Square getStart() {
		return start;
	}


	/**
	 * @return the end
	 */
	public Square getEnd() {
		return end;
	}

	
	
	public void display() {
		
	}
}
