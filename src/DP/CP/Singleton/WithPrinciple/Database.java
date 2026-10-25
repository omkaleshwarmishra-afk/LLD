package DP.CP.Singleton.WithPrinciple;

public enum Database {
    INSTANCE;

    public void connect() {
        System.out.println("Connected to database");
    }
}