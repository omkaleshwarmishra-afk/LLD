package DP.CP.Singleton.WithPrinciple;

public class Main {
    public static void main(String[] args) {

        Database db1 = Database.INSTANCE;
        Database db2 = Database.INSTANCE;

        db1.connect();

        System.out.println(db1 == db2);
    }
}
