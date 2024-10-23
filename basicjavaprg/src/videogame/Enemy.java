package videogame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemy extends Character {
	private int experienceReward;
    private List<Item> lootTable;

    public Enemy(String name, int health, int defense, int attack, int experienceReward) {
        super(name, health, defense, attack);
        this.experienceReward = experienceReward;
        this.lootTable = new ArrayList<>();
        initializeLootTable(); 
    }

    private void initializeLootTable() {
        lootTable.add(new Item("Gold Coin", false)); 
        lootTable.add(new Item("Health Potion", true)); 
        lootTable.add(new Item("Sword", false)); 
    }

    public void dropLoot() {
        if (lootTable.isEmpty()) {
            System.out.println(getName() + " has no loot to drop!");
            return;
        }
        
        Random rand = new Random();
        Item droppedItem = lootTable.get(rand.nextInt(lootTable.size()));
        
        System.out.println(getName() + " has dropped: " + droppedItem.getName());
    }

    public int getExperienceReward() {
        return experienceReward;
    }
}
