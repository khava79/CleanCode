package Adapter;

public class Kilometers implements Distance {
    private double km;

    public Kilometers(double km) {
        this.km = km;
    }

    @Override
    public double getDistance() {
        return km;
    }
}
