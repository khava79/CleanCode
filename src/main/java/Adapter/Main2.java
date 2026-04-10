package Adapter;

public class Main2 {
    public static void main(String[] args) {
        Miles miles = new Miles(20);

        Distance km = new MilesToKilometersAdapter(miles);
        System.out.println("Расстояние в километрах: " + km.getDistance());
    }
}
