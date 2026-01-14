public class Main {
    public static void main(String[] args) {

        Vehicle myCar = new Car("Fiat", "Duna", 1995, CarType.SEDAN);

         Vehicle myElectricCar = new ElectricCar("Tesla", "Model 3", 2023, CarType.SEDAN, 85);

         myCar.star();
         myElectricCar.star();


    }
}
