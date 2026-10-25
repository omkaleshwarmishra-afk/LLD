package DP.CP.Builder.WithOutPrinciple;

public class House {
    String walls;
    String doors;
    String roof;
    boolean swimmingPool;

    public House(String walls, String doors,
                 String roof, boolean swimmingPool) {
        this.walls = walls;
        this.doors = doors;
        this.roof = roof;
        this.swimmingPool = swimmingPool;
    }

    public void showHouse() {
        System.out.println("Walls: " + walls);
        System.out.println("Doors: " + doors);
        System.out.println("Roof: " + roof);
        System.out.println("Swimming Pool: " + swimmingPool);
    }
}