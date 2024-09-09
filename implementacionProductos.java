public class ElectricAuto implements Auto {
    public void drive() {
        System.out.println("Driving an electric car.");
    }
}

public class GasolineAuto implements Auto {
  
    public void drive() {
        System.out.println("Driving a gasoline car.");
    }
}

public class ElectricMoto implements Moto {
  
    public void ride() {
        System.out.println("Riding an electric motorcycle.");
    }
}

public class GasolineMoto implements Moto {
    public void ride() {
        System.out.println("Riding a gasoline motorcycle.");
    }
