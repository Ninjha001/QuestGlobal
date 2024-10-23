package gamingsystem;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the game type (arcade/puzzle/strategy): ");
		String gameType = scanner.next();
		System.out.print("Enter the game difficulty (hard/medium/easy): ");
		String gameDifficulty = scanner.next();
		System.out.print("Enter the Player Performance: ");
		double playerPerformance = scanner.nextDouble();
		System.out.print("Enter the number of PowerUps used: ");
		int powerUpsUsed = scanner.nextInt();
		
		ScoreCalculator score = new ScoreCalculator();
		
		int[]  finalScoreData =  score.calculateScore(gameType, gameDifficulty, playerPerformance, powerUpsUsed);
		
		System.out.println();
		
		System.out.println("DETAILS");
		System.out.println("-------");
		System.out.println("GAME TYPE: " + gameType.toUpperCase() + " GAME");
		System.out.println("DIFFICULTY LEVEL: " + gameDifficulty.toUpperCase());
		System.out.println("PLAYER PERFORMANCE: " + playerPerformance);
		System.out.println("NO OF POWERUPs USED: " + powerUpsUsed + " numbers");
		System.out.println("BASE SCORE: " + finalScoreData[0]);
		System.out.println("PERFORMANCE BONUS: " + finalScoreData[1]);
		System.out.println("POWER UP BONUS: " + finalScoreData[2]);
		System.out.println("FINAL PLAYER SCORE: " + finalScoreData[3]);
		
		scanner.close();
	}
}
