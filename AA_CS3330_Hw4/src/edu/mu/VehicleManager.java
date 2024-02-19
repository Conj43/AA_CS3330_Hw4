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

	public VehicleManager() {
		
	}
	
	
	public boolean readFromFile(String fileName) {
		boolean value = false;
		File inventoryFile = new File(vehicleFilePath); //creating file pointing to file path
		vehicleList = new ArrayList<>();
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
			long modelYear = Long.parseLong(splitString[3]);
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
			
			
			
			if(splitString[0].equals("Truck")) { 
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
	
	
	
	
	
			public <T extends Vehicle> void print(ArrayList<T> vehicle) {
				int i = 1;
				for(Vehicle temp : vehicle) {
					String info = temp.toString(); //very easy because we use toString method that we implemented in each class
					System.out.println(i + ") " + info);  //use a counter to see how many products are in the list
					i++;
				}
			
			}
	
	
	
	}


