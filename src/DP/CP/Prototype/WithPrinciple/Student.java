package DP.CP.Prototype.WithPrinciple;


public class Student implements Prototype {
    String name;
    String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public Student clone() {
        return new Student(this.name, this.course);
    }

    public void display() {
        System.out.println(name + " " + course);
    }
}
