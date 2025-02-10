import player.Player;
import combat.CombatManager;
import enemies.Skeleton;
import enemies.Zombie;
import enemies.Vampire;
import items.GoldCoin;
import items.HealthElixir;
import items.MagicScroll;
import level.LevelManager;
import score.ScoreManager;

public class MainGame {
    public static void main(String[] args) {
        ScoreManager scoreManager = new ScoreManager();
        LevelManager levelManager = new LevelManager();
        Player player = new Player("Makpal", scoreManager);
        CombatManager combatManager = new CombatManager();

        Skeleton skeleton = new Skeleton();
        Zombie zombie = new Zombie();
        Vampire vampire = new Vampire();

        combatManager.fight(player, skeleton);
        combatManager.fight(player, zombie);
        combatManager.fight(player, vampire);

        levelManager.levelUp(player);

        player.pickUpItem(new HealthElixir());
        player.pickUpItem(new MagicScroll());
        player.pickUpItem(new GoldCoin());

        System.out.println("Final Score: " + player.getScore());
    }
}
