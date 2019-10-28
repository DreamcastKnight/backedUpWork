package main;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public Garage() {
		super();
	}
	
	

	private List<Vehicle> vehicles = new ArrayList<>();

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle);
	}

	public boolean removeVehicle(Vehicle vehicle) {
		return this.vehicles.remove(vehicle);
	}

	public void printAll() {
		for (Vehicle p : this.vehicles) {
			System.out.println(p);
		}
	}
	
	public void billTotal() {
		int B=0;
		for (Vehicle p : this.vehicles) {
			System.out.println(B);
		}
	}

	public void removeVehiclesByType(String type) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : vehicles) {
			if (v.getType().equalsIgnoreCase(type)) {
				toRemove.add(v);

			}
		}
		vehicles.removeAll(toRemove);
	}
}
