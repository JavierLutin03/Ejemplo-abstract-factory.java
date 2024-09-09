public class ElectricVehicleFactory implements VehicleFactory {
  
    public Auto createAuto() {
        return new ElectricAuto();
    }

    public Moto createMoto() {
        return new ElectricMoto();
    }
}
public class GasolineVehicleFactory implements VehicleFactory {
    
    public Auto createAuto() {
        return new GasolineAuto();
    }

    public Moto createMoto() {
        return new GasolineMoto();
    }
}
