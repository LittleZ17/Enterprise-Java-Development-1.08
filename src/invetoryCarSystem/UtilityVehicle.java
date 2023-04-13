package invetoryCarSystem;

public class UtilityVehicle extends Car{
    private boolean hasFourWheelDrive;
    public UtilityVehicle(int vinNum, String make, String model, double mileage, boolean hasFourWheelDrive) {
        super(vinNum, make, model, mileage);
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    public boolean isHasFourWheelDrive() {
        return hasFourWheelDrive;
    }

    public void setHasFourWheelDrive(boolean hasFourWheelDrive) {
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    @Override
    public String toString() {
        return "UtilityVehicle{" +
                "hasFourWheelDrive=" + hasFourWheelDrive +
                "} " + super.toString();
    }
}


