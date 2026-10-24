package LLD.SOLID.I.WithOutPrinciple;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.start();
        car.drive();
        car.playMusic();

        bicycle.start();
        bicycle.drive();
        bicycle.playMusic();
    }
}