package LLD.SOLID.L.WithPrinciple;

public class Main {
    public static void main(String[] args) {
        Birds b1 = new Sparrow();

        b1.sound();


        FlyBird fb = new Sparrow();
        fb.fly();
    }
}