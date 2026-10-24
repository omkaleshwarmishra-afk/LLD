package LLD.SOLID.I.WithPrinciple;


public class Car implements Vehicle, MusicSystem {

    public void start() {
        System.out.println("Car started");
    }

    public void drive() {
        System.out.println("Car is driving");
    }

    public void playMusic() {
        System.out.println("Car is playing music");
    }
}