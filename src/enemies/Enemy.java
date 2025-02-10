package enemies;

public abstract class Enemy implements IEnemy {
    protected String type;
    protected int points;

    public Enemy(String type, int points) {
        this.type = type;
        this.points = points;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
