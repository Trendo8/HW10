//Class that takes in and calculates the carbon footprint of a house, car and bicycle and returns the output
//Author: Donato Trentadue
//Date: 2023-04-03

package application;

//Create CarbonFootprint interface
interface CarbonFootprint
{
	double getCF();
}

//Create Car class that takes in the buildings sqft and fuel usage and calculates and outputs carbon footprint of the building
class Building implements CarbonFootprint {
	int SqF;
	float fu;
	
	Building(int squareFoot, float fuelUsed){
		SqF = squareFoot;
		fu = fuelUsed;
	}
	
	public double getCF(){
		float cf = SqF*fu;
		return(cf);
	}

}

//Create Car class that takes in kilometers and fuel usage and calculates and outputs carbon footprint of Car
class Car implements CarbonFootprint
{
	int km;
	float fu;
	
	Car(int kilometers, float fuelUsed){
		km = kilometers;
		fu = fuelUsed;
	}
	
	public double getCF(){
		float cf = km*fu;
		return(cf);
	}
	
}

//Create bicycle class with carbon footprint. Print 0 as bicycles give no carbon footprint
class Bicycle implements CarbonFootprint {

	public double getCF(){
		return(0);
	}

}