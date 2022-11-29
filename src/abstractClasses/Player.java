package abstractClasses;

import java.util.ArrayList;

public class Player {
	private String name;
	private Account account;
	private String color;
	private float rating;
	private ArrayList<Game> history = new ArrayList<Game>();
	
	public Player(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the rating
	 */
	public float getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(float rating) {
		this.rating = rating;
	}

	/**
	 * @return the history
	 */
	public ArrayList<Game> getHistory() {
		return history;
	}

	/**
	 * @param history the history to set
	 */
	public void updateHistory(Game game) {
		this.history.add(game);
	}
}
