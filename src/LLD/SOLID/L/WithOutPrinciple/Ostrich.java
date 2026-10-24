package LLD.SOLID.L.WithOutPrinciple;

public class  Ostrich extends Birds {
    @Override
    public void fly() {
        throw new UnsupportedOperationException(
                "Ostrich cannot fly"
        );
    }
}