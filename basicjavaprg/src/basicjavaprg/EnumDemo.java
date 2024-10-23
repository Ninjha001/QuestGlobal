package basicjavaprg;

enum Day{
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday;
}

enum Level{
	Low(1),Medium(2),High(3);
	private final int levelCode;
	Level(int levelCode){
		this.levelCode = levelCode;
	}
	public int getLevelCode() {
		return this.levelCode;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		Day day = Day.Monday;
		switch(day) {
		case Sunday:
			System.out.println("It's a day to relax!");
			break;
		case Monday:
			System.out.println("Back to work!");
			break;
		default:
			System.out.println("It's still a mid day of the week");
			break;
		}
		System.out.println();
		for(Day days : Day.values()) {
			System.out.println(days);
		}

		
		Level level = Level.High;
		System.out.println("Level: " + level);
		System.out.println("LevelCode: " + level.getLevelCode());
	}
	
	

}
