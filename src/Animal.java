import java.util.*;
/**
 * This is an abstract class used to represent an Animal
 * @author Joshua Domzalski
 * CS131 Final Project
 * Summer 2022
 * @param <T>
 */
public abstract class Animal<T>{
	
	protected int simID;
	protected Location location = new Location();
	protected boolean full;
	protected boolean rested;
	//end variables
	
	/**
	 * An empty-argument constructor for Animal. Sets simID to 0, Location to location (which has a location of [0,0] by default),
	 * Full to false, and Rested to true.
	 */
	public Animal() {
		setSimID(0);
		setLocation(location);
		setFull(false);
		setRested(true);
	}
	/**
	 * A preferred constructor for Animal that sets simID to the simID passed into the constructor. Location to
	 * the Location passed into the constructor, Full to false, and Rested to true.
	 * @param simID
	 * @param l
	 */
	public Animal(int simID, Location l) {
		setSimID(simID);
		setLocation(l);
		setFull(false);
		setRested(true);
	}
	/**
	 * Eat method that generates a random number and checks if that random number is less than or equal to 0.5.
	 * If it is less than or equal to 0.5, full is set to false. If it is greater than 0.5, full is set to true.
	 * @return
	 */
	
	public boolean eat() {
		Random r1 = new Random();
		int rand1 = r1.nextInt();
		if(rand1 <= 0.5) {
			setFull(false);
		}
		else {
			setFull(true);
		}
		return full;
		
	}
	/**
	 * Sleep method that generates a random number and checks if that random number is less than or equal to 0.5.
	 * If it is less than or equal to 0.5, rested is set to false. If it is greater than 0.5, rested is set to true.
	 * @return
	 */
	public boolean sleep() {
		Random r2 = new Random();
		int rand2 = r2.nextInt();
		if(rand2 <= 0.5) {
			setRested(false);
		}
		else {
			setRested(true);
		}
		return rested;
	}
	/**
	 * Getters and setters for each variable
	 * @return
	 */
	public int getSimID() {
		return simID;
	}
	public void setSimID(int simID) {
		this.simID = simID;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public boolean isFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	public boolean isRested() {
		return rested;
	}
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested + "]";
	}
	

	
	
}//end class
