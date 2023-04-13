package invetoryCarSystem;

public class Sedan extends Car{
    public Sedan(int vinNum, String make, String model, double mileage) {
        super(vinNum, make, model, mileage);
    }

    @Override
    public String toString() {
        return "Sedan {" +
                "vinNum=" + getVinNum()+
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                '}';
    }
}
