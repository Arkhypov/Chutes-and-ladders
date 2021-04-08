package com.candidate.chutesladders.main;

public class Player {
	private String name; // Stores the Name of the Player instance
	private int position; // Stores the Players position on the Game Board
	public Player(String name) {
		this.name = name;
		this.position = 0;
	}
	public String getName() {
		return name;
	}
	public int getPosition() {
		return position;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public void changePosition(int steps){
		this.position +=steps;
	}
	/**
	 * the player “spins” the spinner and moves to a new position.
	 * @param s
	 */
	public void spin(Spinner s) {
		int spin= s.getSpin();
		System.out.printf(String.format("\n%s: %s --> %s", name, position, position+spin));
		this.position+=spin;
	} 
}
