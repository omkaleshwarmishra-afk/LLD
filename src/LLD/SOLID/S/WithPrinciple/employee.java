package LLD.SOLID.S.WithPrinciple;

public class employee{

    private String name;

    private double salary;

    public employee(String name , double salary){
        this.name = name;
        this.salary = salary;

    }

    public void saveToDb(){
        System.out.println("save in database");
    }

    public void calculateSalary(){
        System.out.println("Calculating salary");
    }
}
