package AbstractFabric;

public class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("Клик по кнопке MacOS");
    }
}
