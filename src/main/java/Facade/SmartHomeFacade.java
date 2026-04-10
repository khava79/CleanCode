package Facade;

public class SmartHomeFacade {
    private Light light = new Light();
    private AirConditioner ac = new AirConditioner();
    private SecuritySystem security = new SecuritySystem();

    public void turnOnAll() {
        light.on();
        ac.on();
        security.on();
    }

    public void turnOffAll() {
        light.off();
        ac.off();
        security.off();
    }
}
