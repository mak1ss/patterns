package structural.adapter;

public class EurUSCar implements EurUSDriver {

    private EuropeanCar europeanCar;

    public EurUSCar(EuropeanCar europeanCar){
        this.europeanCar = europeanCar;
    }


    @Override
    public void travelDistanceInEurope(double kilometers) {
        europeanCar.move(kilometers);
    }

    @Override
    public double getEuropeanDistance() {
        return europeanCar.getTotalDistance();
    }

    @Override
    public void travelDistanceInUS(double miles) {
        europeanCar.move(miles * 1.60934);
    }

    @Override
    public double getUSDistance() {
        return europeanCar.getTotalDistance() / 1.60934;
    }

    @Override
    public void addEuropeanLuggage(double kilograms) {
        europeanCar.addLuggage(kilograms);
    }

    @Override
    public double getEuropeanLuggage() {
        return europeanCar.getWeight();
    }

    @Override
    public void addUSLuggage(double pounds) {
        europeanCar.addLuggage(pounds * 0.453592);
    }

    @Override
    public double getUSLuggage() {
        return europeanCar.getWeight() / 0.453592;
    }
}
