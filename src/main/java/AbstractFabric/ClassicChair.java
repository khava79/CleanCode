package AbstractFabric;

public class ClassicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на классическом стуле");
    }
}
