import java.util.Arrays;
import java.util.*;
import java.lang.*;

/**
 * This is a class used to test all classes/methods/interfaces in our project
 * @author Joshua Domzalski
 * CS131 Final Project
 * Summer 2022
 */

public class Application{

	public static void main(String[] args) {
		
		//*********************************************

	    //Location Tests

	    //*********************************************
		
		Location l1 = new Location();
		System.out.println(l1.toString());
		Location l2 = new Location(5,10);
		System.out.println(l2.toString());
		l2.update(32, 19);
		System.out.println(l2.toString());
		Location l3 = new Location(10,12);
		System.out.println(l3.toString());
		Location l4 = new Location(8,2);
		System.out.println(l4.toString());
		Location l5 = new Location(60,100);
		l5.getCoordinates();
		System.out.println(l5.toString());
		
		//*********************************************

	    //Animal Tests

		//*********************************************
		
		//Uncomment the line below to see that the type Animal cannot be instantiated
		//Animal a1 = new Animal();
		
		//*********************************************

	    //Goldfinch Tests

		//*********************************************
		
		Goldfinch g1 = new Goldfinch();
		System.out.println(g1.toString());
		Goldfinch g2 = new Goldfinch(3, l2, 9.7);
		System.out.println(g2.toString());
		Goldfinch g3 = new Goldfinch(1, l5, 10.5);
		System.out.println(g3.toString());
		g2.eat();
		g2.sleep();
		g2.fly(l4);
		g2.walk(5);
		
		//*********************************************

	    //BrownBear Tests

		//*********************************************
		
		BrownBear b1 = new BrownBear();
		System.out.println(b1.toString());
		BrownBear b2 = new BrownBear(8, l3, "European");
		System.out.println(b2.toString());
		BrownBear b3 = new BrownBear(4, l4, "Kodiak");
		System.out.println(b3.toString());
		b2.eat();
		b2.sleep();
		b2.walk(8);
		b2.swim(-5);
		
		//*********************************************

		//Generics Tests

		//*********************************************
		
		ArrayList<Animal> genarList = new ArrayList<Animal>();
		genarList.add(g2);
		genarList.add(g3);
		genarList.add(b2);
		genarList.add(b3);
		
		for(int i = 0; i < genarList.size(); i++) {
			System.out.println(genarList.get(i).toString());
		}
		

	}

}

