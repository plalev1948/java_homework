
public class TheFactotyOfDreams {

	public static void main(String[] args) {
		
		machines oldCar = new machines();		//creates object of class oldCar	
		machines newCar = new machines();		//creates object of class newCar
		
		
		oldCar.passengers = 4;
		oldCar.cruiseSpeed = 140;
		oldCar.fuelCapacity = 56.5;
		oldCar.fuelBurnRate = 9.5;
		oldCar.power = 100;
		oldCar.height = 3;
		
		
		newCar.passengers = 6;
		newCar.cruiseSpeed = 201;
		newCar.fuelCapacity = 102.5;
		newCar.fuelBurnRate = 20.5;
		newCar.power = 150;
		newCar.height = 2;
		
		
		System.out.println("Old Car");
		oldCar.Endurance();
		oldCar.Distance();
		
		System.out.println("New Car");
		newCar.Endurance();
		newCar.Distance();
		newCar.HighestTemperature();
		
	}
}


class machines {
	int passengers;				//number of people
	int cruiseSpeed;			//miles per hour
	double fuelCapacity;		//gallons
	double fuelBurnRate;		//gallons per hour 
	int power;
	String myColor = "Yellow";
	int height;
	
	//method to calculate machine endurance
	
	void Endurance() {
		double endurance;
		endurance = fuelCapacity / fuelBurnRate;
		System.out.println("The endurance is " + endurance + " hours.");
	}
	
	 void HighestTemperature() {
			double temperature;
			temperature = 100 / 4;
			System.out.println("The maximum temperature that can be achieved is " + temperature + " Celsius");
			}
	 
	 //method to calculate the distance
	void Distance() {
		double distance;
		distance = power / passengers;
		System.out.println("The travelled distance is " + distance + " kmh");
	}
}

class Person {
	String Name = "Pavel";
}

class Engine{
	int power;
}

class ProductionEngine {
	int power;
}

class HeatManager {
	int HeatEngine = 100;
	int WrapperEngine = 4;
}

