package combat;

import player.Player;
import enemies.IEnemy;

public class CombatManager {
    public void fight(Player player, IEnemy enemy) {
        System.out.println(player.getName() + " is fighting " + enemy.getType());
        player.defeatEnemy(enemy);
    }
}
