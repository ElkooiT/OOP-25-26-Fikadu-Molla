public class Vehicle {

  protected String make;
  protected String model;
  protected int year;
  protected String colour;
  int totalServiceCount;

  public Vehicle(String make, String model, int year, String colour) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.colour = colour;
    this.totalServiceCount = 0;
}

public void displayInfo(){
  System.out.printIn("Make: " + make);
  System.out.printIn("Model " + model);
  System.out.printIn("Year " + year);
  System.out.printIn("Colour " + colour);
  System.out.printIn("Services done " + totalServiceCount);
}

public final void logService(String note) {
  totalServiceCount++;
  System.out.printIn("Service #" + totalServiceCount + " for " + make + " " + model + ": " + note);
}

public static String getVehicleCategory() {
  return "General Vehicle";
}

@Override
public String toString() {
  return year + " " + make + " " + model + " (" + colour + ")";
}
}
