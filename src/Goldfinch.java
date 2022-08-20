/**
 * This is a class used to represent a Goldfinch
 * @author Joshua Domzalski
 * CS131 Final Project
 * Summer 2022
 */
public class Goldfinch extends Animal implements Flyable, Walkable {
	private double wingSpan;
	//end variables
	
	/**
	 * An empty-argument constructor for Goldfinch. Sets simID to 0, Location to location (which has a location of [0,0] by default),
	 * Full to false, Rested to true, and wingSpan to 9.0.
	 */
	public Goldfinch() {
		setSimID(0);
		setLocation(location);
		setFull(false);
		setRested(true);
		setWingSpan(9.0);
	}
	/**
	 * A preferred constructor for Goldfinch that sets simID to the simID passed into the constructor. Location to
	 * the Location passed into the constructor, wingSpan to the wingSpan passed into the constructor, 
	 * Full to false, and Rested to true.
	 * @param simID
	 * @param l
	 * @param wingSpan
	 */
	public Goldfinch(int simID, Location l, double wingSpan) {
		setSimID(simID);
		setLocation(l);
		setWingSpan(wingSpan);
		setFull(false);
		setRested(true);
	}

	/**
	 * Getter and setter for WingSpan. 
	 * Only sets wingSpan to the value passed in if the value passed in is between 5.0 and 11.0.
	 * If the value is not in the specified range, wingSpan is defaulted to 0.0
	 * @return
	 */

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		if(wingSpan >= 5 && wingSpan <= 11) {
			setWingSpan(wingSpan);
		}
		else
			setWingSpan(0.0);
	}
	/**
	 * toString method
	 */

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}

	@Override
	
	/**
	 * Walkable interface that accepts an integer value used to represent direction.
	 * If direction is positive, the location of the Goldfinch increases it's xCoord and yCoord by 1.
	 * If direction is negative, the location of the Goldfinch decreases it's xCoord and yCoord by 1.
	 */
	public void walk(int direction) {
		if(direction>0) {
			setLocation((xCoord+1),(yCoord+1));
		}
		else
			setLocation((xCoord-1),(yCoord-1));
		
	}
	/**
	 * Flyable interface that accepts a Location value.
	 * Location of the Goldfinch is set to whatever Location was passed into the interface.
	 */

	@Override
	public void fly(Location l) {
		setLocation(l);
		
	}
	
	
	
}//end class
