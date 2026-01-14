public class ElectricCar extends Car implements Electric{


    private int batteryLevel;


    public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }
    @Override
    void star() {
     System.out.println("El auto electrico esta encendido");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("La bateria esta cargada al 100%");
        
    }

    @Override
    public String toString() {
        return "ElectricCar{batteryLevel=" + batteryLevel + "}" + super.toString();
    }

 
}
