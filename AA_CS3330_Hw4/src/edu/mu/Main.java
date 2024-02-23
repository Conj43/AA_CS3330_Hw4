package edu.mu;

import edu.mu.vehicles.*;

public class Main {

	public static void main(String[] args) {
		VehicleManager manager = new VehicleManager();
		
		boolean value = manager.readFromFile();
		
		System.out.println(value);
		
		manager.print(manager.vehicleList);
		
		System.out.println("\n\nDisplaying Car Information:\n");
		
		manager.displayAllCarInformation();
		
		System.out.println("\n\nDisplaying Truck Information:\n");
		
		manager.displayAllTruckInformation();
		
		System.out.println("\n\nDisplaying SUV Information:\n");
		
		manager.displayAllSUVInformation();
		
		System.out.println("\n\n\n");
		
		System.out.println("vehicle with the highest maintenance = " +manager.getVehicleWithHighestMaintenanceCost(1000));
		
		System.out.println("vehicle with the lowest maintenance = " +manager.getVehicleWithLowestMaintenanceCost(1000));
		
		System.out.println("vehicle with the highest fuel efficiency = " +manager.getVehicleWithHighestFuelEfficiency(100, 2.0));
		
		System.out.println("vehicle with the lowest fuel efficiency = " +manager.getVehicleWithLowestFuelEfficiency(100, 2.0));
		
		System.out.println("average SUV fuel efficiency = " + manager.getAverageFuelEfficiencyOfSUVs(100, 2.0));
		
//		VehicleColor color = VehicleColor.RED;
//		FuelType fuel = FuelType.GASOLINE;
//		StartMechanism start = StartMechanism.KEYSTART;
		
		
//		Truck newTruck = new Truck("Chevy", "Silverado", 2016, 999, color, fuel, 123, 2.1, 21, 50, start);
//		manager.addVehicle(newTruck);
//		
//		manager.saveVehicleList();
		
		
		
	}
	

}
