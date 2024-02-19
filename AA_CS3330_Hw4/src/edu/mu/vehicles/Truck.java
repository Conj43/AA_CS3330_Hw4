package edu.mu.vehicles;

import edu.mu.FuelType;
import edu.mu.StartMechanism;
import edu.mu.VehicleColor;

public class Truck extends Vehicle{

	//default constructor
	public Truck() {
		
	}
	//super constructor
	public Truck(String brand, String make, long modelYear, Double price, VehicleColor color, 
			FuelType fuelType, Double mileage, Double mass, int cylinders, Double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
	}
	
	//copy constructor
		public Truck(Truck truck) {
			this.brand =  truck.brand;
			this.make = truck.make;
			this.modelYear = truck.modelYear;
			this.price = truck.price;
			this.color = truck.color;
			this.fuelType = truck.fuelType;
			this.mileage = truck.mileage;
			this.mass = truck.mass;
			this.cylinders = truck.cylinders;
			this.gasTankCapacity = truck.gasTankCapacity;
			this.startType = truck.startType;
			
		}
		
		
		
		
		
		
		
		
		@Override
		public String toString() {
			return "Truck [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price=" + price
					+ ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass=" + mass
					+ ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity + ", startType=" + startType
					+ "]";
		}
		@Override
		public double calculateMaintenaceCost(double distance) {
			return (distance * mass * (2024-modelYear) * cylinders * .002);
			
		}
		@Override
		public double calculateFuelEfficiency(double distance, double fuelPrice) {
			return (cylinders * gasTankCapacity * fuelPrice) / (distance * 0.1);
		}
		@Override
		public void startEngine() {
			System.out.println("KEYSTART");
		}
		
		

}
