package invetoryCarSystem;

public abstract class Car {
    private int vinNum;
    private String make;
    private String model;
    private double mileage;

    public Car(int vinNum, String make, String model, double mileage) {
        this.vinNum = vinNum;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public int getVinNum() {
        return vinNum;
    }

    public void setVinNum(int vinNum) {
        this.vinNum = vinNum;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinNum=" + vinNum +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
