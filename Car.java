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
  
