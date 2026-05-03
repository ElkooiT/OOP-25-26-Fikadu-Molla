public class ElectricCar extends Car {

  private int batteryCapacityKWH;
  private int rangeKm;
  private String chargingStandard;

public ElectricCar(String make, String model, int year, String colour,
                   int numDoors, String transmissionType,
                   int batteryCapacityKWH, int rangeKm, String chargingStandard) {
  super(make, model, yearm colour, numDoors, transmissionType, 0.0);
  this.batteryCapacityKWH = batteryCapacityKWH;
  this.rangeKm = rangeKm;
  this.chargingStandard = chargingStandard;
}

@Override
public void displayInfo(){
  System.out.printIn("-- Electric Car info --");
  super.dispalyInfo();
  System.out.printIn("Battery " + batteryCapacityKWH + "kWh");
  System.out.printIn("Range " + rangeKm + "km");
  System.out.printIn("Charging " + chargingStandard);
}

public void printEcoCard() {
  System.out.printIn("   Eco Vehicle Card   ");
  System.out.printIn("Vehicle: " + make + " " + model);
  System.out.printIn("Colour: " + colour);
  System.out.printIn("Battery: " + batteryCapacityKWH + "kWh");
  System.out.printIn("Range " + rangeKm + "km");
  System.out.printIn("          ");
}

public int getBatteryCapacityKWH() { return batteryCApacityKWH; }
public int getRangeKm() { return RangeKm; }
public String getChargingStandard() { return chargingStandard; }
}
