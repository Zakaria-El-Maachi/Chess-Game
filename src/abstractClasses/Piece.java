package abstractClasses;

public abstract class Piece {
	
	private String name;
	private String color;
	private int[] coords = new int[2];
	private boolean taken;
	
	public Piece(String name, String color, int[] coords) {
		this.name = name;
		this.color = color;
		this.coords = coords;
		this.taken = false;
	}
	
	/**
	 * @return the taken
	 */
	public boolean isTaken() {
		return taken;
	}
	/**
	 * @param taken the taken to set
	 */
	public void setTaken(boolean taken) {
		this.taken = taken;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @return the coords
	 */
	public int[] getCoords() {
		return coords;
	}
	/**
	 * @param coords the coords to set
	 */
	public void setCoords(int[] coords) {
		this.coords = coords;
	}
	
	public abstract Move move(Square start, Square end);
	abstract boolean validMove(Square start, Square end);
}
