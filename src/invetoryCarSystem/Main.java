package invetoryCarSystem;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(1234, "Nissan", "SD-1234", 80.000);
        UtilityVehicle utilityVehicle = new UtilityVehicle(5678, "Toyota", "TY-567", 20.000, true);
        Truck truck = new Truck(9182, "Scania", "SC-918", 30.000, 8.5);

        System.out.println(sedan.toString());
        System.out.println(utilityVehicle.toString());
        System.out.println(truck.toString());
    }
}
