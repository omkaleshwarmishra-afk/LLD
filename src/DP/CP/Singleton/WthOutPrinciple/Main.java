package DP.CP.Singleton.WthOutPrinciple;

public class Main {
    public static void main(String[] args) {

        Database db1 = new Database();
        Database db2 = new Database();

        db1.connect();
        db2.connect();

        System.out.println(db1 == db2);
    }
}