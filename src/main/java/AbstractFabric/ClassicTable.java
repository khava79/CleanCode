package AbstractFabric;

public class ClassicTable implements Table {
    @Override
    public void use() {
        System.out.println("Используем классический стол");
    }
}
