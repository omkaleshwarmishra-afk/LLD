package LLD.SOLID.D.WithOutPrinciple;

public class Car {
    private Engine engine = new Engine();

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}