package DP.CP.AbstractFactoryMethod.WithPrinciple;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();

        System.out.println("-----");

        factory = new MacFactory();

        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}