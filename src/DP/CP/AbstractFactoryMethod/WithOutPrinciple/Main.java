package DP.CP.AbstractFactoryMethod.WithOutPrinciple;


class WindowsButton {
    void render() {
        System.out.println("Windows Button");
    }
}

class WindowsCheckbox {
    void render() {
        System.out.println("Windows Checkbox");
    }
}

class MacButton {
    void render() {
        System.out.println("Mac Button");
    }
}

class MacCheckbox {
    void render() {
        System.out.println("Mac Checkbox");
    }
}

public class Main {
    public static void main(String[] args) {
        String os = "Windows";

        if (os.equals("Windows")) {
            WindowsButton button = new WindowsButton();
            WindowsCheckbox checkbox = new WindowsCheckbox();

            button.render();
            checkbox.render();
        } else if (os.equals("Mac")) {
            MacButton button = new MacButton();
            MacCheckbox checkbox = new MacCheckbox();

            button.render();
            checkbox.render();
        }
    }
}
