package main;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Garage garage = new Garage();
		garage.addVehicle(new Car());
		garage.addVehicle(new Truck());
		garage.addVehicle(new Boat());
		garage.printAll();
		garage.removeVehiclesByType("truck");
		garage.printAll();
	}

}
