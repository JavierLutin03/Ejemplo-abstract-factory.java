public class VehicleApplicationConfigurator {
    public static void main(String[] args) {
        VehicleFactory factory;
        String fuelType = "electric"; 

        if (fuelType.equalsIgnoreCase("electric")) {
            factory = new ElectricVehicleFactory();
        } else {
            factory = new GasolineVehicleFactory();
        }

        VehicleApplication app = new VehicleApplication(factory);
        app.useVehicles();
    }
}
