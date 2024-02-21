package edu.mu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.mu.vehicles.*;

//connor-branch creation
public class VehicleManager {
	
	final String vehicleFilePath = "files/vehicleList.csv";
	public ArrayList<Vehicle> vehicleList;
	
	//default constructor
	public VehicleManager() {
		
	}
	
	//definition of this on assignment doesn't make sense
	//it is supposed to be constructor, but it is displayed as public void VehicleManager(String fileName) which would be a method
	//also, you can't access the vehicleFilePath unless you have already made a vehicle manager object, so this confuses me
	public VehicleManager(String fileName) {
		readFromFile(fileName);
	}


	
	public boolean readFromFile(String fileName) {
		boolean value = false; //creating return value
		File inventoryFile = new File(vehicleFilePath); //creating file pointing to file path
		vehicleList = new ArrayList<>(); //initialize vehicle list
		try {
		Scanner scanner = new Scanner(inventoryFile); //create scanner for csv file
		

		while(scanner.hasNext()) { //loop to end of file
			value = true; //if scanner works, and file isn't empty, we set return value to true
			String line = scanner.nextLine();   //create one big string as the next line
			String[] splitString = line.split(",", 12); 
			if(splitString[0].equals("Type")) { //checks if we are looking at the first row, which is just name of each column
				//if true, we don't want to add this to our array list so we do nothing
			}
			else {
			long modelYear = Long.parseLong(splitString[3]); //for this we need to change to the corresponding type for each field in the vehicle 
			double price = Double.parseDouble(splitString[4]);
			String tempColor = splitString[5].toUpperCase(); 
			VehicleColor color = VehicleColor.valueOf(tempColor);
			String tempFuel = splitString[6].toUpperCase();
			FuelType fuel = FuelType.valueOf(tempFuel);
			double mileage = Double.parseDouble(splitString[7]);
			double mass = Double.parseDouble(splitString[8]);
			int cylinders = Integer.parseInt(splitString[9]);
			double gasTankCapacity = Double.parseDouble(splitString[10]);
			String tempStart = splitString[11].toUpperCase();
			StartMechanism type = StartMechanism.valueOf(tempStart);
			
			
			
			if(splitString[0].equals("Truck")) { //look at first row to see which type of vehicle we need to make
				Truck newTruck = new Truck(splitString[1], splitString[2], modelYear, price, color, fuel, mileage, mass, cylinders, gasTankCapacity, type);
				vehicleList.add(newTruck);
			}
			else if(splitString[0].equals("Car")) {
				Car newCar = new Car(splitString[1], splitString[2], modelYear, price, color, fuel, mileage, mass, cylinders, gasTankCapacity, type);
				vehicleList.add(newCar);
			}
			else if(splitString[0].equals("MotorBike")) {
				MotorBike newBike = new MotorBike(splitString[1], splitString[2], modelYear, price, color, fuel, mileage, mass, cylinders, gasTankCapacity, type);
				vehicleList.add(newBike);
			}
			else if(splitString[0].equals("SUV")) {
				SUV newSUV = new SUV(splitString[1], splitString[2], modelYear, price, color, fuel, mileage, mass, cylinders, gasTankCapacity, type);
				vehicleList.add(newSUV);
			}
			}
		}
		scanner.close(); //close scanner
		
		}
		catch (FileNotFoundException e){

            e.printStackTrace();
            value = false; //change return value to false if we couldn't find file or something went wrong
        }
		
		
		return value;//return true on success, false on failure
	}
	
	
	
	
	
	//displays information for every instance of Car in vehicle list
	public void displayAllCarInformation() {
		int count = 0; //just keeps track if we have found any cars
		for(Vehicle vehicle : vehicleList) {
			if(vehicle instanceof Car) { //look for an instance of Car
				String temp = vehicle.toString();
				System.out.println(temp); //use to string to print out info
				count++; //increment, so we know we have found at least one car
			}
		}
		if(count == 0) {
			System.out.println("Error! There were no Cars Found!"); //if no cars were found, we print error message
		}
	}
	
	public void displayAllTruckInformation() { //displays information for all trucks in vehicle list
		int count = 0; //used same as previous method to see if we found any trucks
		for(Vehicle vehicle : vehicleList) {
			if(vehicle instanceof Truck) {
				String temp = vehicle.toString(); //use to string to display all information
				System.out.println(temp);
				count++; //increment so we know we found a truck
			}
		}
		if(count == 0) {
			System.out.println("Error! There were no Trucks Found!"); //if no trucks were found, print error message
		}
	}
	
	
	//displays information for all SUVs in vehicle lost
	public void displayAllSUVInformation() {
		int count = 0;
		for(Vehicle vehicle : vehicleList) { //loops through
			if(vehicle instanceof SUV) { //checks if current vehicle is instance of SUV
				String temp = vehicle.toString(); //use to string to display information
				System.out.println(temp);
				count++; //update so we know we found a SUV
			}
		}
		if(count == 0) {
			System.out.println("Error! There were no SUVs Found!"); //print error if no SUVs found
		}
	}
	
	
	//displays information for all Motor Bikes in vehicle lost
		public void displayAllMotorBikeInformation() {
			int count = 0;
			for(Vehicle vehicle : vehicleList) { //loops through
				if(vehicle instanceof MotorBike) { //checks if current vehicle is instance of a Motorbike
					String temp = vehicle.toString(); //use to string to display information
					System.out.println(temp);
					count++; //update so we know we found a Motor Bike
				}
			}
			if(count == 0) {
				System.out.println("Error! There were no Motor Bikes Found!"); //print error if no Motorbikes found
			}
		}
		
		public void displayVehicleInformation(Vehicle v) {
		    String temp = v.toString(); //get string representation of the vehicle
		    if (temp != null) {
		        System.out.println(temp); //print the vehicle information
		    } else {
		        System.out.println("Error! Vehicle not found.");
		    }
		}
			
		public void displayAllVehicleInformation() {
		    if (vehicleList.isEmpty()) {
		        System.out.println("No vehicles found in the inventory.");
		    } else {
		        for (Vehicle vehicle : vehicleList) {
		            System.out.println(vehicle.toString());
		        }
		    }
		}

		public boolean removeVehicle(Vehicle vehicle) { //checks the list of vehicls to see if it contains the speciic vehicle
		    if (vehicleList.contains(vehicle)) {
		        vehicleList.remove(vehicle); //if it is found it will remove the vehicle
		        return true;//returns true if correctly removed
		    } 
		    else {
		        return false;//if not found it will return false
		    }
		}

	
	
			public <T extends Vehicle> void print(ArrayList<T> vehicle) {
				int i = 1;
				for(Vehicle temp : vehicle) {
					String info = temp.toString(); //very easy because we use toString method that we implemented in each class
					System.out.println(i + ") " + info);  //use a counter to see how many products are in the list
					i++;
				}
			
			}
	
	
	
	}


