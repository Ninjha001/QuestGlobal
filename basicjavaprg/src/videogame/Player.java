package videogame;

import java.util.HashMap;
import java.util.Map;

public class Player extends Character {
	private Map<String, Item> inventory; 
    private Item equippedItem; 

    public Player(String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
        this.inventory = new HashMap<>();
        this.equippedItem = null; 
    }

    public void equipItem(Item item) {
        if (!item.isUsable()) {
            equippedItem = item;
            System.out.println(getName() + " equips " + item.getName());
        } else {
            System.out.println("You can't equip " + item.getName() + "!");
        }
    }

    public void useItem(Item item) {
        if (inventory.containsKey(item.getName()) && item.isUsable()) {
            System.out.println(getName() + " uses " + item.getName());
            this.health += item.getHealAmount(); 
            inventory.remove(item.getName()); 
            System.out.println(item.getName() + " has been used and removed from inventory.");
            System.out.println(getName() + "'s health is now: " + getHealth());
        } else if (!item.isUsable()) {
            System.out.println(item.getName() + " cannot be used!");
        } else {
            System.out.println("Item cannot be used or is not in inventory!");
        }
    }

    public void addItemToInventory(Item item) {
        inventory.put(item.getName(), item);
        System.out.println(item.getName() + " added to inventory.");
    }

    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        
        System.out.println("Inventory:");
        for (String key : inventory.keySet()) {
            System.out.println("- " + key);
        }
        
        if (equippedItem != null) {
            System.out.println("Equipped Item: " + equippedItem.getName());
        } else {
            System.out.println("No item currently equipped.");
        }
        
        System.out.println(); 
    }
}
