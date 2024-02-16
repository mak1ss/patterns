package structural.adapter;

public class EuropeanCar {

    private double totalDistance;
    private double weight;

    public void move(double distance){
        totalDistance += distance;
    }

    public void addLuggage(double weight){
        this.weight += weight;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
