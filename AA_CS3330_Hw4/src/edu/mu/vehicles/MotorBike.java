package edu.mu.vehicles;

import java.time.Year;

import edu.mu.FuelType;
import edu.mu.StartMechanism;
import edu.mu.VehicleColor;

public class MotorBike extends Vehicle{
	protected Year year = Year.now();
	protected double currentYear = year.getValue();
	//default constructor
	public MotorBike() {
		
	}
	
	//super constructor
			public MotorBike(String brand, String make, long modelYear, double price, VehicleColor color, 
					FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
				super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
			}
			
			//copy constructor
				public MotorBike(MotorBike bike) {
					this.brand =  bike.brand;
					this.make = bike.make;
					this.modelYear = bike.modelYear;
					this.price = bike.price;
					this.color = bike.color;
					this.fuelType = bike.fuelType;
					this.mileage = bike.mileage;
					this.mass = bike.mass;
					this.cylinders = bike.cylinders;
					this.gasTankCapacity = bike.gasTankCapacity;
					this.startType = bike.startType;
					
				}

				@Override
				public String toString() {
					return "MotorBike [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price="
							+ price + ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass="
							+ mass + ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity
							+ ", startType=" + startType + "]";
				}

				@Override
				public double calculateMaintenaceCost(double distance) {
					return (distance * mass * (currentYear-modelYear) * cylinders * .0002);
					
				}
				@Override
				public double calculateFuelEfficiency(double distance, double fuelPrice) {
					return (cylinders * gasTankCapacity * fuelPrice) / (distance * 0.001);
				}
				@Override
				public void startEngine() {
					System.out.println("KICKsSTART");
				}
				
				

}
