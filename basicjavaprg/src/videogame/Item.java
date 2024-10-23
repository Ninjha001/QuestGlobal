package videogame;

public class Item {
	 	private String name;
	    private boolean usable; 
	    private int healAmount; 

	    public Item(String name, boolean usable) {
	        this.name = name;
	        this.usable = usable;
	        this.healAmount = usable ? 20 : 0; 
	    }

	    public String getName() {
	        return name;
	    }

	    public boolean isUsable() {
	        return usable;
	    }

	    public int getHealAmount() {
	        return healAmount;
	    }
}
