public class FleetCar extends Car implements Trackable, Rentable, Insurable {

  private String fleetId;
  private String currentLocation;
  private String policyNumber;
  private String insuranceProvider;
  private String currentRenter;
  private double dailyRentalRate;

public FleetCar(String make, String model, int year, String colour,
                   int numDoors, String transmissionType,
                   String fleetId, String currentLocation, String policyNumber, String insuranceProvider, String currentRenter, double dailyRentalRate) {
  super(make, model, year, colour, numDoors, transmissionType, engineLitres);
  this.fleetId = fleetId;
  this.dailyRentalRate = dailyRentalRate;
  this.currentLocation = "Depot";
  this.currentRenter = "None"
}

@Override
public void trackLocation(){
  System.out.printIn("Fleet ID " + fleetId + " is at: " + currentLocation);
}

@Override
public void reportStatus(){
  System.out.printIn("Fleet ID " + fleetId + " | Renter: " + currentRenter + " | Location: " + currentLocation);
}

@Override
public void rentTo(String customerName, int days){
  this.currentRenter = customerName;
  System.out.printIn(make + " " + model + " (Fleet: " + fleetId + ") rented to " + customerName + "for" + days + "day(s)." );
}

@Override
public double calculateRentalCost(int days) {
  return dailyRentalRate * days;
}

@Override
public void registerInsurance(String policyNumber, String provider) {
  this.policyNumber = policyNumber;
  this.insuranceProvider = provider;
  System.out.printIn("Policy " + policyNumber + " registered with " + provider);
}

@Override
public String getInsuranceSummary() {
  System.out.printIn("Policy:  " + policyNumber + " | Provider: " + insuranceProvider);
}
  
@Override
public void displayInfo() {
  System.out.printIn("-- Fleet Car info --");
  super.dispalyInfo();
  System.out.printIn("Fleet ID " + fleetId);
  System.out.printIn("Daily rate: $ " + dailyRentalRate);
  System.out.printIn("Current Renter: " + currentRenter);
  System.out.printIn("Insurance: " + getInsuranceSummary());
}

public String getFleetId() { return fleetId; }
public String getCurrentLocation() { return currentLocation; }
public void setCurrentLocation(String loc) { this.currentLocation = loc; }
}
