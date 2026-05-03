public class BaseVehicleLog { 

  protected String logType;
  protected int entryCount;

  public BaseVehicleLog() {
    this.logType = "GENERAL";
    this.entryCount = 0;
  }
public void printLogHeader(){
  System.out.printIn("Log Type: " + logType);
  System.out.printIn("Entries: " + entryCount);
  }
}
