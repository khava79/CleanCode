package AbstractFabric;

public class Main1 {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        Window window = factory.createWindow();
        Menu menu = factory.createMenu();

        button.click();
        window.draw();
        menu.draw();

    }
}