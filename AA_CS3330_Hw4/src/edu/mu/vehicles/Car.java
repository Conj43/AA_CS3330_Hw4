package edu.mu.vehicles;

import java.time.Year;

import edu.mu.FuelType;
import edu.mu.StartMechanism;
import edu.mu.VehicleColor;

public class Car extends Vehicle{
	protected Year year = Year.now();
	protected double currentYear = year.getValue();
	//default constructor
	public Car() {
		
	}
	
	//super constructor
		public Car(String brand, String make, long modelYear, double price, VehicleColor color, 
				FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
			super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		}
		
		//copy constructor
			public Car(Car car) {
				this.brand =  car.brand;
				this.make = car.make;
				this.modelYear = car.modelYear;
				this.price = car.price;
				this.color = car.color;
				this.fuelType = car.fuelType;
				this.mileage = car.mileage;
				this.mass = car.mass;
				this.cylinders = car.cylinders;
				this.gasTankCapacity = car.gasTankCapacity;
				this.startType = car.startType;
				
			}

			@Override
			public String toString() {
				return "Car [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price=" + price
						+ ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass=" + mass
						+ ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity + ", startType="
						+ startType + "]";
			}

			@Override
			public double calculateMaintenaceCost(double distance) {
				return (distance * mass * (currentYear-modelYear) * cylinders * .0005);
				
			}
			@Override
			public double calculateFuelEfficiency(double distance, double fuelPrice) {
				return (cylinders * gasTankCapacity * fuelPrice) / (distance * 0.003);
			}
			@Override
			public void startEngine() {
				System.out.println("PUSHSTART");
			}
			
			
			
			

}
