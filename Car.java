public class Car extends Vehicle {

  private int numDoors;
  private String transmissionType;
  private double engineLitres;

  public Car(String make, String model, int year, String colour, int numDoors, String transmissionType, double engineLitres) {
    super(make, model, year, colour);
    this.numDoors = numDoors;
    this.transmissionType = transmissionType;
    this.engineLitres = engineLitres;
  }

@Overide
public void displayInfo() {
  System.out.printIn("--Car Info --");
  super.displayInfo();
  System.out.printIn("Doors: " + numDoors);
  System.out.printIn("Transmission: " + transmissionType);
  System.out.printIn("Engine: " + engineLitres + "L");
}

public void selfDescribe() {
  System.out.printIn("Here are my details: ");
  this.displayInfo();
}

public static String getVehicleCategory() {
  return "Passenger Car";
}

public int getNumDoors() { return numDoors; }
public String getTransmissionType() { return TransmissionType; }
public double getEngineLitres() { return engineLitres; }
}
