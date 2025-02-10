package items;

public class HealthElixir implements IItem {
    @Override
    public void use() {
        System.out.println("Health restored!");
    }
}
