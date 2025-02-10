package level;

import player.Player;

public class LevelManager {
    private int level = 1;

    public void levelUp(Player player) {
        level++;
        System.out.println(player.getName() + " leveled up to level " + level + "!");
    }
}
