public class VehicleApplication {
    private Auto auto;
    private Moto moto;

    public VehicleApplication(VehicleFactory factory) {
        auto = factory.createAuto();
        moto = factory.createMoto();
    }

    public void useVehicles() {
        auto.drive();
        moto.ride();
    }
}
