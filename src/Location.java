import java.util.*;
/**
 * This is a class used to represent the Location of an object.
 * @author Joshua Domzalski
 * CS131 Final Project
 * Summer 2022
 */
public class Location {

	private int xCoord;
	private int yCoord;
	//end variables
	
	/**
	 * An empty-argument constructor for Location that initializes xCoord and yCoord to 0.
	 */
	public Location() {
		this.xCoord = 0;
		this.yCoord = 0;
	}//end empty-argument constructor
	/**
	 * A preferred constructor for Location that allows two integers, x and y, to be passed in to it.
	 * Sets xCoord and yCoord to the respective passed in values.
	 * @param x
	 * @param y
	 */
	public Location(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
	}//end preferred constructor
	/**
	 * A method that updates xCoord and yCoord to respective passed in values for x and y.
	 * @param x
	 * @param y
	 */
	public void update(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
	}//end update method
	/**
	 * A method that returns the coordinates of an object by returning an array of xCoord and yCoord, in that order.
	 * @return
	 */
	public int[] getCoordinates() {
		int ar[] = {xCoord, yCoord};
		return ar;
	}//end getter for Coordinates
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "[xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}

	
	
}//end class
