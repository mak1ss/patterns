package structural.adapter;

public interface EurUSDriver {
    void travelDistanceInEurope(double kilometers);
    double getEuropeanDistance();
    void travelDistanceInUS(double miles);
    double getUSDistance();
    void addEuropeanLuggage(double kilograms);
    double getEuropeanLuggage();
    void addUSLuggage(double pounds);
    double getUSLuggage();
}
