package abstractClasses;

public abstract class Board {
	
	private int[] matrixDimensions = new int[2];
	private Square[][] board;
	private int squareDimension;
	private Square[][] defaultSetup;
	private Piece[] outOfBounds;
	
	public Board(int[] matrixDimensions, Square[][] board, int squareDimension, Square[][] defaultSetup, Piece[] outOfBounds) {
		this.matrixDimensions = matrixDimensions;
		this.board = board;
		this.squareDimension = squareDimension;
		this.defaultSetup = defaultSetup;
		this.outOfBounds = outOfBounds;
	}

	public int[] getMatrixDimensions() {
		return matrixDimensions;
	}

	public void setMatrixDimensions(int[] matrixDimensions) {
		this.matrixDimensions = matrixDimensions;
	}

	public Square[][] getBoard() {
		return board;
	}

	public void setBoard(Square[][] board) {
		this.board = board;
	}

	public int getSquareDimension() {
		return squareDimension;
	}

	public void setSquareDimension(int squareDimension) {
		this.squareDimension = squareDimension;
	}

	public Square[][] getDefaultSetup() {
		return defaultSetup;
	}

	public void setDefaultSetup(Square[][] defaultSetup) {
		this.defaultSetup = defaultSetup;
	}

	public Piece[] getOutOfBounds() {
		return outOfBounds;
	}

	public void setOutOfBounds(Piece[] outOfBounds) {
		this.outOfBounds = outOfBounds;
	}
	
	
}
