interface Trackable {
  void trackLocation();
  void reportStatus();
}

interface Rentable {
  void rentTo(String customerName, int days);
  double calculateRentalCost(int days);
}

interface Insurable {
  void registerInsurance(String policyNumber, String provider);
  String getInsuranceSummary();
}
