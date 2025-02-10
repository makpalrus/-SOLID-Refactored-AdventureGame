package enemies;

import java.util.ArrayList;
import java.util.List;

public class EnemyManager {
    private List<Enemy> enemies;

    public EnemyManager() {
        enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }

    public Enemy getNextEnemy() {
        return enemies.isEmpty() ? null : enemies.get(0);
    }

    public boolean hasEnemies() {
        return !enemies.isEmpty();
    }
}
