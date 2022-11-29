package abstractClasses;

import java.util.ArrayList;
import java.util.Random;

public abstract class Game {
	private boolean rated;
	private Player[] players = new Player[2];
	private Player currentPlayer;
	private int duration;
	private Board board;
	private ArrayList<Move> moves = new ArrayList<Move>();
	private String result;
	
	public Game(boolean rated, Player[] players, Board board) {
		this.rated = rated;
		this.players = players;
		this.board = board;
		Random random = new Random();
		this.currentPlayer = players[random.nextInt(2)];
	}
	
	public void switchPlayers() {
	}
	
	public void start() {
	}
	
	public void pause() {
	}
	
	public void resume() {
	}
	
	public void end() {
	}
	
	public void abort() {
	}

	/**
	 * @return the rated
	 */
	public boolean isRated() {
		return rated;
	}

	/**
	 * @return the players
	 */
	public Player[] getPlayers() {
		return players;
	}

	/**
	 * @return the currentPlayer
	 */
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * @param currentPlayer the currentPlayer to set
	 */
	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * @return the moves
	 */
	public ArrayList<Move> getMoves() {
		return moves;
	}

	/**
	 * @param adds move to Moves ArrayList
	 */
	public void addMove(Move move) {
		this.moves.add(move);
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
}
