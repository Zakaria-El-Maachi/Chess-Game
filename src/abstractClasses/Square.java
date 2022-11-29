package abstractClasses;

public abstract class Square {
	
	
	private String name;
	private String color;
	private int[] coords = new int[2];
	private int dimension;
	private Piece content;
	
	public Square(String name, String color, int[] coords, int dimension, Piece content) {
		this.name = name;
		this.color = color; 
		this.coords = coords;
		this.dimension = dimension;
		this.content = content;
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
	 * @return the dimension
	 */
	public int getDimension() {
		return dimension;
	}
	/**
	 * @return the content
	 */
	public Piece getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(Piece content) {
		this.content = content;
	}
	
}
