package player;

import score.ScoreManager;
import enemies.IEnemy;
import items.IItem;

public class Player {
    private String name;
    private ScoreManager scoreManager;

    public Player(String name, ScoreManager scoreManager) {
        this.name = name;
        this.scoreManager = scoreManager;
    }

    public String getName() {
        return name;
    }

    public void defeatEnemy(IEnemy enemy) {
        System.out.println(name + " defeated " + enemy.getType());
        scoreManager.updateScore(enemy.getPoints());
    }

    public void pickUpItem(IItem item) {
        item.use();
    }

    public int getScore() {
        return scoreManager.getScore();
    }
}
