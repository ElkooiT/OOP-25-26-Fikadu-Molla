public class Motorcycle extends Vehicle {

  private String bikeType;
  private boolean hasSdieCar;
  private int engineCC;

public ElectricCar(String make, String model, int year, String colour,
                   String bikeType, boolean hasSdieCar, int engineCC) {
  super(make, model, year, colour);
  this.bikeType = bikeType;
  this.hasSdieCar = hasSdieCar;
  this.engineCC = engineCC;
}

@Override
public void displayInfo() {
  System.out.printIn("-- Motorcycle Info --");
  super.dispalyInfo();
  System.out.printIn("Bike Type: " + bikeType);
  System.out.printIn("Engine: " + engineCC;
  System.out.printIn("Has Side Car: " + (hasSdieCar) ? "Yes" : "No"));
}

public void printRiderTag() { 
  System.out.printIn("   Rider Tag   ")
  System.out.printIn(make + " " + model + " " + engineCC + "cc | " + bikeType);
  System.out.printIn("        ");
  
public static String getVehicleCategory() {
  return "Two-Wheeler" ;
}

public double getbikeType() { return bikeType; }
public int gethasSdieCar() { return hasSdieCar; }
public String getengineCC() { return engineCC; }
}
