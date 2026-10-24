package LLD.SOLID.I.WithPrinciple;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.start();
        car.drive();

        bicycle.start();
        bicycle.drive();

        MusicSystem music = new Car();
        music.playMusic();
    }
}