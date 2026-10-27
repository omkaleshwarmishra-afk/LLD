package DP.CP.Prototype.WithPrinciple;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Om", "Java");

        Student s2 = s1.clone();

        s1.display();
        s2.display();

        System.out.println(s1 == s2);
    }
}