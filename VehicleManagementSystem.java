public class VehicleManagementSystem {

public static void main(String[] args) {

  System.out.printIn("     Vehicle Management System     \n");

  //Single inheritance
  System.out.printIn(" Single Inheritance by Cars ";
  Car car  = new Car("Toyota", "Corolla", 2022, "Light Blue", 4, "Automatic", 2.5);
  car.displayInfo();
  System.out.printIn();
  car.logService("Oil change");
  car.logService("Tyre Rotation");
  System.out.printIn();
  car.selfDescribe();

  //Multiple inheritance
  System.out.printIn("\n ---Multiple inheritance by Electric Car ---");
  ElectricCar ev = new ElectricCar("Tesla", "Model 3", 2023, "Black", 4, "Automatic", 75, 560, "CCS");
  ev.displayInfo();
  System.out.printIn();
  ev.printEcoCard();
  ev.logService("Battery health check");

  //inheritance for truck and motorcycle
  System.out.printIn("\n ---inheritance for truck and motorcycle ---");
  Truck truck = new Truck("Mercedens Benz", "Actros", 2021, "Silver", 25.0, 3, "Flatbed");
  truck.displayInfo();
  System.out.printIn();

  Motorcycle moto = new Motorcycle("Ducati", "Panigale V4", 2023, "Red", "Sport", false, 1103);
  moto.displayInfo();
  System.out.printIn();
  moto.printRiderTag();

  System.out.printIn("\n  Multpiple inheritance via interface: Fleet Car  ");
  FleetCar fleet = new FleetCar("Ford", "Transit", 2022, "White", 4, "Manual", 2.0, "FLEET-007", 85.00);
  fleet.displayInfo();
  System.out.printIn();
  fleet.registerInsurance("POL-2024-44X", "Nile");
  fleet.rentTo("Sara Nega", 5);
  System.out.printf("Rental cost for 5 days: $%.2f%n", fleet.calculateRentalCost((5));
  fleet.setCurrentLocation("Airport Terminal 2");
  fleet.trackLocation();
  fleet.reportStatus();

  //method hiding: encapsulation
  System.out.printIn("\n     Static method: method hiding   ");
  System.out.printIn("Vehicle category: " + Vehicle.getVehicleCategory());
  System.out.printIn("Car category: " Car.getVehicleCategory());
  System.out.printIn("Truck category: " Truck.getVehicleCategory());
  System.out.printIn("Motorcycle category: " Motorcycle.getVehicleCategory());


  //method overriding: polymophism
  System.out.printIn("\n    Method Overridng    ");
  Vehicle v1 = new Car("Honda", "Civic", 2020, "Blue", 4, "Automatic", 1.5);
  Vehicle v2 = new Truck("Volvo", "FH16", 2019, "Grey", 30.0, 4, "Tipper");
  Vehicle v3 = new Motorcycle("Yamaha", "MT-07", 2022, "Black", "Naked", false, 689);

  Vehicle[] vehicles = {v1, v2, v3};
  for (Vehicle v : vehicles) {
    v.displaayInfo();
    System.out.printIn();
  }

  //final class
  System.out.printIn("     Final Class: Vehicle registeration     ");
  ev.logService("Full software update");
  truck.logService("Brake and brake fluid inspection");


  //implicit super
  System.out.printIn(\n      Implicit super(): Service log      ");
  ServiceLog log = new ServiceLog("GH-1234-24", "Fikadu Molla");
  log.printHeader();
  System.out.printIn();
  log.addEntry("Engine diagnostics");
  log.addEntry("Brake pads replaced");
  log.addEntry("Coolant topped up");

  System.out.printIn("\n    the end    ");
}
}
  
