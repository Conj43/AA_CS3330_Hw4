package edu.mu.vehicles;

import java.time.Year;

import edu.mu.FuelType;
import edu.mu.StartMechanism;
import edu.mu.VehicleColor;

public class Truck extends Vehicle{
	protected Year year = Year.now();
	protected double currentYear = year.getValue();

	//default constructor
	public Truck() {
		
	}
	//super constructor
	public Truck(String brand, String make, long modelYear, double price, VehicleColor color, 
			FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
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
			return (distance * mass * (currentYear-modelYear) * cylinders * .002);
			
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
