package edu.mu;

public class Main {

	public static void main(String[] args) {
		VehicleManager manager = new VehicleManager();
		
		boolean value = manager.readFromFile(manager.vehicleFilePath);
		
		System.out.println(value);
		
		manager.print(manager.vehicleList);
		
		System.out.println("\n\nDisplaying Car Information:\n");
		
		manager.displayAllCarInformation();
		
		System.out.println("\n\nDisplaying Truck Information:\n");
		
		manager.displayAllTruckInformation();
		
		System.out.println("\n\nDisplaying SUV Information:\n");
		
		manager.displayAllSUVInformation();

	}

}
