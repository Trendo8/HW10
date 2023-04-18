//Driver class for CarbonFootprint.java. Also creates a GUI to take inputs and show output
//Author: Donato Trentadue
//Date: 2023-04-03

package application;
	

import java.util.*;
import javax.swing.*;

public class driver
{
	public static void main(String args[]){
		
		String sqIn = JOptionPane.showInputDialog("Enter in the Buildings Square Feet: ");
		String kmIn = JOptionPane.showInputDialog("Enter in the Kilometers Driven: ");
		String kmBIn = JOptionPane.showInputDialog("Enter in the Kilometers Biked: ");
		int sq = Integer.parseInt(sqIn);
		int km = Integer.parseInt(kmIn);
		int kmB = Integer.parseInt(kmBIn);
		
//Create an ArrayList for CF objects, generate building, car and bicycle. Add square foot/distance traveled and factor for fuel to building and car objects
		ArrayList<CarbonFootprint> cf = new ArrayList<CarbonFootprint>();
		Building b = new Building(sq, 3.8f);
		Car c = new Car(km, 2.23f);
		Bicycle bc = new Bicycle();
		
//Add objects to ArrayList
		cf.add(b);
		cf.add(c);
		cf.add(bc);
		
					
//Create panel at size of 5, 42
		JTextArea outputTextArea = new JTextArea( 5, 42 );
		
		//Create header for the panel
		outputTextArea.append( "Type\tSqFoot/KmTravelled\tFuel Usage\tCarbon Footprint\n" );
		
			//Create inputs and outputs for the panel
			outputTextArea.append("Building\t" + sq +"\t\t3.8\t" +  String.format("%.2f", b.getCF()) + 
					"\nCar\t" + km + "\t\t2.23\t" + String.format("%.2f", c.getCF()) + 
					"\nBicycle\t" + kmB + "\t\t" + "0\t0" );
		
		JOptionPane.showMessageDialog(null, outputTextArea, "Carbon Footprint", JOptionPane.INFORMATION_MESSAGE );
	}
		
}


