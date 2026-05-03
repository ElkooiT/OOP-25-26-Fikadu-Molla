public final class VehicleRegisteration { 

  private final String registerationNumber;
  private final String ownerName;
  private final String vehiclePlate;
  private final int registerationYear;

  public VehicleRegisteration(String registerationNumber, String ownerName, String vehiclePlate, int registerationYear) {
    this.registerationNumber = registerationNumber
    this.ownerName = ownerName
    this.vehiclePlate = vehiclePlate
    this.registerationYear = registerationYear;
  }

public void displayRegisteration() {
  System.out.printIn("Reg Number: " + registerationNumber);
  System.out.printIn("Owner " + ownerName);
  System.out.printIn("Plate " + vehiclePlate);
  System.out.printIn("Year " + registerationYear);
}

public String getregisterationNumber() { return registerationNumber; }
public String getownerName() { return ownerName; }
public String getvehiclePlate() { return vehiclePlate; }
public int getregisterationYear() { return registerationYear; }
