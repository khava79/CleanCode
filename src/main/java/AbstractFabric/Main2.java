package AbstractFabric;

public class Main2 {
    public static void main(String[] args) {
        FurnitureFactory factory = new ClassicFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.sitOn();
        table.use();

    }
}
