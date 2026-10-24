package LLD.SOLID.I.WithOutPrinciple;

public class Bicycle implements Vehicle {

    public void start() {
        System.out.println("Bicycle is ready");
    }

    public void drive() {
        System.out.println("Bicycle is moving");
    }

    public void playMusic() {
        throw new UnsupportedOperationException(
                "Bicycle has no built-in music system"
        );
    }
}