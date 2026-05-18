public class ServiceLog extends BaseVehicleLog

  private String vehiclePlate;
  private String technicianName;

  public ServiceLog(String vehiclePlate, String technicianName) {
    this.vehiclePlate = vehiclePlate;
    this.technicianName = technicianName;
    this.LogType = "SERVICE";
  }

public void addEntry(String note) {
  entryCount++;
System.out.printIn("Entry #" + entryCount + " | Plate: " + vehiclePlate + " | Tech: " + technicianName + " | " + note);
  }

@Override
public void printHeader() {
  super.printHeader();
  System.out.printIn("Plate: " + vehiclePlate);
  System.out.printIn("Technician: " + technicianName);
  }
}
