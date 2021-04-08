package com.candidate.chutesladders.main;

import java.util.Random;

public class Spinner {
	private int number; // range of spinner
	public Spinner(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	/**
	 * Creates a Random object called ‘generator’
		Gets a number from ‘generator’
	 * @return the number
	 */
	public int getSpin(){
		Random gen = new Random();
		return gen.nextInt(this.number) +1;
	}
	public void setNumber(int number) {
		this.number = number;
	} 
	
}
