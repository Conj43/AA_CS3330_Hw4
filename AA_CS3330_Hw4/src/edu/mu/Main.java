package edu.mu;

public class Main {

	public static void main(String[] args) {
		VehicleManager manager = new VehicleManager();
		
		boolean value = manager.readFromFile(manager.vehicleFilePath);
		
		System.out.println(value);
		
		manager.print(manager.vehicleList);

	}

}
