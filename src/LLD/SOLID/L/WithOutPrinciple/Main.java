package LLD.SOLID.L.WithOutPrinciple;

public class Main {
    public static void main(String[] args) {
        Birds bird = new Ostrich();
        bird.fly();
    }
}

       // Yahan Penguin, Bird ki jagah use hone par exception throw karta hai.
// Isliye parent class ka expected behaviour break hota hai.