package videogame;

public class Character {
	private String name;
	protected int health;
	private int defense;
	int attack;
	
	public Character(String name, int health, int defense, int attack) {
		this.name = name;
		this.health = health;
		this.defense = defense;
		this.attack = attack;
	}
	
	public void attack(Character target) {
		int damage = Math.max(1, this.attack - target.defense);
		System.out.println(this.name + " attacks " + target.name + " for " + damage + " damage.");
		target.health -= damage;
	}
	
	public void defend(int damage) {
		int effectiveDamage = Math.max(1, damage - this.defense);
		this.health -= effectiveDamage;
		System.out.println(this.name + " defends and takes " + effectiveDamage + " damage.");
	}
	
	public boolean isAlive() {
		return health>0;
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}
	
	public int getAttack() {
		return attack;
	}
}
