package DP.CP.Prototype.WithOutPrinciple;

class Student {
    String name;
    String course;

    Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println(name + " " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Om", "Java");

        Student s2 = new Student("Om", "Java");

        s1.display();
        s2.display();
    }
}