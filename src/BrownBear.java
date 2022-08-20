import java.util.*;
/**
 * This is a class used to represent a BrownBear
 * @author michaeldomzalski
 *
 */
public class BrownBear extends Animal implements Swimmable, Walkable{
	private String subSpecies;
	//end variables
	
	/**
	 * An empty-argument constructor for BrownBear. Sets simID to 0, Location to location (which has a location of [0,0] by default),
	 * subSpecies to "Alaskan", Full to false, and Rested to true
	 */
	public BrownBear() {
		setSimID(0);
		setLocation(location);
		setSubSpecies("Alaskan");
		setFull(false);
		setRested(true);
	}
	/**
	 * A preferred constructor for BrownBear that sets simID to the simID passed into the constructor. Location to
	 * the Location passed into the constructor, subSpecies to the subSpecies passed into the constructor, 
	 * Full to false, and Rested to true.
	 * @param SimID
	 * @param l
	 * @param subSpecies
	 */
	public BrownBear(int SimID, Location l, String subSpecies) {
		setSimID(simID);
		setLocation(l);
		setSubSpecies(subSpecies);
		setFull(false);
		setRested(true);
	}
	
	/**
	 * Getter and Setter for subSpecies. Setter checks that the subSpecies passed in is one of the acceptable species.
	 * If the species passed in is not acceptable, subSpecies is set to null.
	 * @return
	 */
	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies) {
		if(subSpecies == "Alaskan" || subSpecies == "Asiatic" || subSpecies == "European"
				|| subSpecies == "Grizzly" || subSpecies == "Kodiak" || subSpecies == "Siberian") {
			setSubSpecies(subSpecies);
		}
		else
			setSubSpecies(null);
	}
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}
	
	/**
	 * Walkable interface that accepts an integer value used to represent direction.
	 * If direction is positive, the location of the BrownBear increases it's xCoord and yCoord by 3.
	 * If direction is negative, the location of the BrownBear decreases it's xCoord and yCoord by 3.
	 */
	public void walk(int direction) {
		if (direction > 0) {
			setLocation((xCoord+3), (yCoord+3));
		}
		else
			setLocation((xCoord-3),(yCoord-3));
		
	}
	/**
	 * Swimmable interface that accepts an integer value used to represent direction.
	 * If direction is positive, the location of the BrownBear increases it's xCoord and yCoord by 2.
	 * If direction is negative, the location of the BrownBear decreases it's xCoord and yCoord by 2.
	 */
	@Override
	public void swim(int direction) {
		if (direction > 0) {
			setLocation((xCoord+2), (yCoord+2));
		}
		else
			setLocation((xCoord-2), (yCoord-2));
	
	}

} //end class
