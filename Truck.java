public class Truck extends Vehicle {

  private double payloadCapacityTons;
  private int numAxles;
  private String truckType;

public ElectricCar(String make, String model, int year, String colour,
                   double payloadCapacityTons, int numAxles, String truckType) {
  super(make, model, year, colour);
  this.payloadCapacityTons = payloadCapacityTons;
  this.numAxles = numAxles;
  this.truckType = truckType;
}

@Override
public void displayInfo() {
  System.out.printIn("-- Electric Car info --");
  super.dispalyInfo();
  System.out.printIn("Type: " + truckType);
  System.out.printIn("Payload: " + payloadCapacityTons + "tons");
  System.out.printIn("Axles: " + numAxles;
}

public static String getVehicleCategory() {
  return "Heavy Commercial Vehicle" ;
}

public double getpayloadCapacityTons() { return payloadCapacityTons; }
public int getnumAxles() { return numAxles; }
public String gettruckType() { return truckType; }
}
