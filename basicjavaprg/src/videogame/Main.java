package videogame;

public class Main {
	public static void main(String[] args) {
		Player player = new Player("Hero", 100, 20, 5); 
	    Enemy enemy = new Enemy("Goblin", 50, 3, 15, 100); 
	    Item potion = new Item("Health Potion", true);
	    Item sword = new Item("Sword", false);
	    player.showInventory();
	    player.addItemToInventory(potion);
	    player.addItemToInventory(sword);
	    player.showInventory();
	    player.equipItem(sword);
	    player.showInventory();
	    player.attack(enemy);
	    if (enemy.isAlive()) {
            enemy.attack(player);  
            player.defend(enemy.attack); 
        }
        
        if (!enemy.isAlive()) {
            enemy.dropLoot();
            System.out.println("Experience gained: " + enemy.getExperienceReward());
            player.showInventory();
            player.useItem(potion);
            player.showInventory();
            player.equipItem(new Item("Sword", false));
            player.showInventory();
            System.out.println(player.getName() + "'s Health: " + player.getHealth());
            System.out.println(enemy.getName() + "'s Health: " + (enemy.isAlive() ? enemy.getHealth() : 0));
        } else {
            System.out.println(enemy.getName() + " is still alive!");
        }
	}
}
