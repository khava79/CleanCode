package Facade;

public class Main2 {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();

        home.turnOnAll();
        home.turnOffAll();
    }
}
