package items;

public class GoldCoin implements IItem {
    @Override
    public void use() {
        System.out.println("Gold coin collected!");
    }
}
