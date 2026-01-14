public class Car extends Vehicle {

    private CarType type;


    public Car(String brand, String model, int year, CarType type) {
        super(brand, model, year);
        this.type = type;
    }
    @Override
    void star() {
        System.out.println("El auto arranco");
        
    }
    @Override
    public String toString() {
        return super.toString() + " Type= " + type;
    }
    
}
