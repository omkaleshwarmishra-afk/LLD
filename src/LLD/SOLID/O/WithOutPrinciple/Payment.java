package LLD.SOLID.O.WithOutPrinciple;


public class Payment {
    public void pay(String mode) {
        if (mode.equals("UPI")) {
            System.out.println("Payment through UPI");
        } else if (mode.equals("Card")) {
            System.out.println("Payment through Card");
        }
    }
}
