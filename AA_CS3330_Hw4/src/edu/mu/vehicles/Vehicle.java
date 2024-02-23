package edu.mu.vehicles;


import edu.mu.*;

public abstract class Vehicle {
	
	protected String brand;
	protected String make;
	protected long modelYear;
	protected Double price;
	protected VehicleColor color;
	protected FuelType fuelType;
	protected Double mileage;
	protected Double mass;
	protected int cylinders;
	protected Double gasTankCapacity;
	protected StartMechanism startType;
	

	//default constructor
	public Vehicle() {
		
	}
	//parameterized constructor
	public Vehicle(String brand, String make, long modelYear, double price, VehicleColor color, 
			FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		this.brand =  brand;
		this.make = make;
		this.modelYear = modelYear;
		this.price = price;
		this.color = color;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.mass = mass;
		this.cylinders = cylinders;
		this.gasTankCapacity = gasTankCapacity;
		this.startType = startType;
		
	}
	
	//copy constructor
	public Vehicle(Vehicle vehicle) {
		this.brand =  vehicle.brand;
		this.make = vehicle.make;
		this.modelYear = vehicle.modelYear;
		this.price = vehicle.price;
		this.color = vehicle.color;
		this.fuelType = vehicle.fuelType;
		this.mileage = vehicle.mileage;
		this.mass = vehicle.mass;
		this.cylinders = vehicle.cylinders;
		this.gasTankCapacity = vehicle.gasTankCapacity;
		this.startType = vehicle.startType;
		
	}
	
	public abstract double calculateMaintenaceCost(double distance);
	public abstract double calculateFuelEfficiency(double distance, double fuelPrice);
	public abstract void startEngine();

	
	//getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public long getModelYear() {
		return modelYear;
	}

	public void setModelYear(long modelYear) {
		this.modelYear = modelYear;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public VehicleColor getColor() {
		return color;
	}

	public void setColor(VehicleColor color) {
		this.color = color;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public Double getMileage() {
		return mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public Double getMass() {
		return mass;
	}

	public void setMass(Double mass) {
		this.mass = mass;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public Double getGasTankCapacity() {
		return gasTankCapacity;
	}

	public void setGasTankCapacity(Double gasTankCapacity) {
		this.gasTankCapacity = gasTankCapacity;
	}

	public StartMechanism getStartType() {
		return startType;
	}

	public void setStartType(StartMechanism startType) {
		this.startType = startType;
	}

	
	//to string method
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price=" + price
				+ ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass=" + mass
				+ ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity + ", startType=" + startType
				+ "]";
	}
	
	

}
