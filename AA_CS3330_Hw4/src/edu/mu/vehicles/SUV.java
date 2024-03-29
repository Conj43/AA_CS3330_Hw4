package edu.mu.vehicles;

import java.time.Year;

import edu.mu.FuelType;
import edu.mu.StartMechanism;
import edu.mu.VehicleColor;

public class SUV extends Vehicle{
	protected Year year = Year.now();
	protected double currentYear = year.getValue();
	//default constructor
	public SUV() {
		
		
	}
	//super constructor
			public SUV(String brand, String make, long modelYear, double price, VehicleColor color, 
					FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
				super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
			}
			
			//copy constructor
				public SUV(SUV suv) {
					this.brand =  suv.brand;
					this.make = suv.make;
					this.modelYear = suv.modelYear;
					this.price = suv.price;
					this.color = suv.color;
					this.fuelType = suv.fuelType;
					this.mileage = suv.mileage;
					this.mass = suv.mass;
					this.cylinders = suv.cylinders;
					this.gasTankCapacity = suv.gasTankCapacity;
					this.startType = suv.startType;
					
				}
				
				
				@Override
				public String toString() {
					return "SUV [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price=" + price
							+ ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass=" + mass
							+ ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity + ", startType="
							+ startType + "]";
				}
				@Override
				public double calculateMaintenaceCost(double distance) {
					return (distance * mass * (currentYear-modelYear) * cylinders * .001);
					
				}
				@Override
				public double calculateFuelEfficiency(double distance, double fuelPrice) {
					return (cylinders * gasTankCapacity * fuelPrice) / (distance * 0.05);
				}
				@Override
				public void startEngine() {
					System.out.println("PUSHSTART");
				}
}
