package invetoryCarSystem;

public class Truck extends Car {
    private double towingCapacity;
    public Truck(int vinNum, String make, String model, double mileage, double towingCapacity) {
        super(vinNum, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "towingCapacity=" + towingCapacity +
                "} " + super.toString();
    }
}
